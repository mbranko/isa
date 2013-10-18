package mbs2.pr05;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class HelloClient {
  
  public static void main(String[] args) {
    System.setProperty(Context.INITIAL_CONTEXT_FACTORY, 
        "org.apache.openejb.client.RemoteInitialContextFactory");
    System.setProperty(Context.PROVIDER_URL, 
        "http://localhost:8080/tomee/ejb");
    try {
      Logger.getLogger("").setLevel(Level.OFF);
      Context ctx = new InitialContext();
      Hello hello = (Hello)ctx.lookup("HelloBeanRemote");
      
      String response = hello.hello("Branko");
      
      System.out.println("Response: " + response);
    } catch (NamingException ex) {
      ex.printStackTrace();
    }
  }
}
