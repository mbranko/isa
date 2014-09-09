package isa.pr20.bean;

import isa.pr20.CreditCard;
import isa.pr20.PurchaseOrder;

import javax.naming.Context;
import javax.naming.InitialContext;

public class PurchaseClient {

  public static void main(String[] args) {
    System.setProperty(Context.INITIAL_CONTEXT_FACTORY, 
        "org.apache.openejb.client.RemoteInitialContextFactory");
    System.setProperty(Context.PROVIDER_URL, 
        "http://localhost:8080/tomee/ejb");
    try {
      CreditCard card = new CreditCard(12, 2010, "John Doe", "411111111111");
      PurchaseOrder order = new PurchaseOrder();
      
      Context ctx = new InitialContext();
      Purchase purchase = (Purchase)ctx.lookup("Purchase20BeanRemote");
      
      boolean status = purchase.processOrder(order, card);
      System.out.println(status ? "Order processed." : "Order rejected.");
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
