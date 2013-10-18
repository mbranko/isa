package mbs2.pr09;

import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.naming.Context;
import javax.naming.InitialContext;

public class PurchaseClient {

  public static void main(String[] args) {
    System.setProperty(Context.INITIAL_CONTEXT_FACTORY, 
        "org.apache.openejb.client.RemoteInitialContextFactory");
    System.setProperty(Context.PROVIDER_URL, 
        "http://localhost:8080/tomee/ejb");
    try {
      Logger.getLogger("").setLevel(Level.OFF);
      CreditCard card = new CreditCard(12, 2010, "John Doe", "411111111111");
      Order order = new Order(card, new Date(), new ArrayList<String>(), 
          new ArrayList<Integer>());
      
      
      Context ctx = new InitialContext();
      Purchase purchase = (Purchase)ctx.lookup("PurchaseBean9Remote");
      
      boolean status = purchase.processOrder(order);
      
      System.out.println(status ? "Order processed." : "Order rejected.");

    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

}
