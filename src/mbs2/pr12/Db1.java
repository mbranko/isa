package mbs2.pr12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Db1 {

  public static void main(String[] args) {
    try {
      // ucitavanje JDBC drajvera
      Class.forName("com.mysql.jdbc.Driver");

      // otvaranje konekcije
      Connection conn = DriverManager.getConnection(
        "jdbc:mysql://localhost/mbs2", "mbs2", "mbs2");

      // slanje upita
      String query = "SELECT ime, prezime FROM nastavnici";
      Statement stmt = conn.createStatement();
      ResultSet rset = stmt.executeQuery(query);

      // citanje rezultata upita
      while (rset.next()) {
        System.out.println(rset.getString(1) + " " + rset.getString(2));
        //rset.getString(1);
        //rset.getInt(2);
        //rset.getBoolean(3);
        //rset.getDate(4);
        //rset.getFloat(5);
        //...
      }

      // oslobadjanje resursa
      rset.close();
      stmt.close();

      // zatvaranje konekcije
      conn.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}

