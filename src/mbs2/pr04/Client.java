package mbs2.pr04;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

public class Client {
  public static void main(String[] args) {
    try {
      System.out.println("Connecting to server...");
      Properties env = new Properties();
      env.put("java.naming.factory.initial",
          "com.sun.jndi.rmi.registry.RegistryContextFactory");
      env.put("java.naming.provider.url",
          "rmi://localhost:1099");
      Context ctx = new InitialContext(env);
      ServerI server = (ServerI)ctx.lookup("ServerObject");
      System.out.println("Count: " + server.count());
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
