package mbs2.pr07;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.naming.Context;
import javax.naming.InitialContext;

public class CountClient {

  public static void main(String[] args) {
    System.setProperty(Context.INITIAL_CONTEXT_FACTORY, 
        "org.apache.openejb.client.RemoteInitialContextFactory");
    System.setProperty(Context.PROVIDER_URL, 
        "http://localhost:8080/tomee/ejb");
    try {
      Logger.getLogger("").setLevel(Level.OFF);
      Context ctx = new InitialContext();
      Count c = (Count)ctx.lookup("CountBean7Remote");
  
      for (int i = 0; i < 10; i++) {
        System.out.println("count: " + c.count());
        Thread.sleep(100);
      }
      
      c.remove();
  
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}