package mbs2.pr14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class Test {
  public static void main(String[] args) throws Exception {
    User zika = new User(1, "Zika", "Zikic");
    User pera = new User(2, "Pera", "Peric");
    User laza = new User(3, "Laza", "Lazic");
    
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection(
        "jdbc:mysql://localhost/mbs2", "mbs2", "mbs2");
    
    PreparedStatement p = conn.prepareStatement(
        "INSERT INTO users (user_id, username, pasword) VALUES (?, ?, ?)");
    
    // upisi ziku
    p.setInt(1, zika.getUserID());
    p.setString(2, zika.getUsername());
    p.setString(3, zika.getPassword());
    p.executeUpdate();
    
    // upisi peru
    p.setInt(1, pera.getUserID());
    p.setString(2, pera.getUsername());
    p.setString(3, pera.getPassword());
    p.executeUpdate();

    // upisi lazu
    p.setInt(1, laza.getUserID());
    p.setString(2, laza.getUsername());
    p.setString(3, laza.getPassword());
    p.executeUpdate();
    
    p.close();
    
    // pronadji korisnika sa user_id=2
    User user = null;
    Statement s = conn.createStatement();
    ResultSet r = s.executeQuery(
        "SELECT user_id, username, pasword FROM users WHERE user_id=2");
    if (r.next()) {
      user = new User();
      user.setUserID(r.getInt(1));
      user.setUsername(r.getString(2));
      user.setPassword(r.getString(3));
    }
    r.close();
    s.close();
    
    // azuriraj lozinku tom korisniku
    user.setPassword("***");
    
    p = conn.prepareStatement(
        "UPDATE users SET pasword=? WHERE user_id=?");
    p.setString(1, user.getPassword());
    p.setInt(2, user.getUserID());
    p.executeUpdate();
    
    conn.close();
  }

}
