package mbs2.pr20.container;

import javax.naming.Context;
import javax.naming.InitialContext;

import mbs2.pr20.CreditCard;
import mbs2.pr20.PurchaseOrder;

public class PurchaseClient2 {

  public static void main(String[] args) {
    System.setProperty(Context.INITIAL_CONTEXT_FACTORY, 
        "org.apache.openejb.client.RemoteInitialContextFactory");
    System.setProperty(Context.PROVIDER_URL, 
        "http://localhost:8080/tomee/ejb");
    try {
      CreditCard card = new CreditCard(12, 2010, "John Doe", "411111111111");
      PurchaseOrder order = new PurchaseOrder();
      
      Context ctx = new InitialContext();
      Purchase purchase = (Purchase)ctx.lookup("Purchase20ContainerRemote");
      
      boolean status = purchase.processOrder(order, card);
      System.out.println(status ? "Order processed." : "Order rejected.");
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
