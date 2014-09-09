package isa.pr12;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Db3 {

  public static void main(String args[]) {
    try {
      Class.forName("com.mysql.jdbc.Driver");

      Connection conn = DriverManager.getConnection(
        "jdbc:mysql://localhost/isa", "isa", "isa");

      // Povezivanje novih nastavnika sa predmetima
      CallableStatement stmt = conn.prepareCall(
          "{call povezi (?, ?, ?)}");
      stmt.setString(1, "Sima");
      stmt.setString(2, "Simic");
      stmt.setString(3, "Osnovi racunarstva");
      int status = stmt.executeUpdate();
      System.out.println("Status poziva stored procedure: " + status);
      stmt.close();
      conn.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
