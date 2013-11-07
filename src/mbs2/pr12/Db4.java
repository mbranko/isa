package mbs2.pr12;

import java.io.IOException;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Ilustruje pristup bazi podataka iz servleta.
 */
public class Db4 extends HttpServlet {

  /** 
   * Inicijalizacija servleta: otvaranje veze sa bazom 
   */
  public void init(ServletConfig config) throws ServletException {
    super.init(config);
    try {
      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection(
          "jdbc:mysql://localhost/mbs2", "mbs2", "mbs2");
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
  
  /** 
   * Unistavanje servleta: zatvaranje veze sa bazom 
   */
  public void destroy() {
    try {
      conn.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  public void doGet(HttpServletRequest req, HttpServletResponse res)
      throws ServletException, IOException {
    try {
      // postavljanje upita
      String query = "select ime, prezime from nastavnici";
      Statement stmt = conn.createStatement();
      ResultSet rset = stmt.executeQuery(query);
      List<String> imena = new ArrayList<String>();
      List<String> prezimena = new ArrayList<String>();
      while (rset.next()) {
        imena.add(rset.getString(1));
        prezimena.add(rset.getString(2));
      }
      rset.close();
      stmt.close();
      
      // generisanje HTML stranice
      res.setContentType("text/html");
      PrintStream out = new PrintStream(res.getOutputStream());
      out.println("<html><head><title>Spisak nastavnika</title></head>");
      out.println("<body bgcolor=\"#FFFFFF\">");
      out.println("<h3>Nastavnici u bazi:</h3>");
      out.println("<pre>");
      for (int i = 0; i < imena.size(); i++)
        out.println(imena.get(i) + " " + prezimena.get(i) + "<br>");
      out.println("</pre></body></html>");  
      out.flush();
    } catch (Exception ex) {
      // generisanje HTML stranice sa opisom greske
      res.setContentType("text/html");
      PrintStream out = new PrintStream(res.getOutputStream());
      out.println("<html><head><title>Spisak nastavnika</title></head>");
      out.println("<body bgcolor=\"#FFFFFF\"><pre>");
      out.println("Dogodila se greska:<br> " + ex.toString() + "</pre></body></html>");  
      out.flush();
    }
  }
  
  /** Konekcija sa bazom podataka */
  private Connection conn;
}