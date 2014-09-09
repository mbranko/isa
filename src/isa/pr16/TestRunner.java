package isa.pr16;

import isa.util.ScriptRunner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;

public class TestRunner {
  public static void main(String[] args) throws Exception {
    System.out.println("Kreiram demo bazu...");
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection(
        "jdbc:mysql://localhost/isa", "isa", "isa");
    BufferedReader init = new BufferedReader(new InputStreamReader(
        TestRunner.class.getResource("/isa/pr16/init.sql").openStream(), "UTF-8"));
    ScriptRunner sr = new ScriptRunner(conn, false, true);
    sr.setDelimiter(";", false);
    sr.runScript(init);
    conn.close();
    init.close();
    
    System.out.println("Pokrecem primer 16...");
    Test.main(new String[0]);
  }
}
