package mbs2.pr17;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;

import mbs2.util.ScriptRunner;

public class TestRunner {
  public static void main(String[] args) throws Exception {
    System.out.println("Kreiram demo bazu...");
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection(
        "jdbc:mysql://localhost/mbs2", "mbs2", "mbs2");
    BufferedReader init = new BufferedReader(new InputStreamReader(
        TestRunner.class.getResource("/mbs2/pr17/init.sql").openStream(), "UTF-8"));
    ScriptRunner sr = new ScriptRunner(conn, false, true);
    sr.setDelimiter(";", false);
    sr.runScript(init);
    conn.close();
    init.close();
    
    System.out.println("Pokrecem primer 17...");
    Test.main(new String[0]);
  }
}
