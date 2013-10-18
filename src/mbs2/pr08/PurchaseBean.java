package mbs2.pr08;

import java.util.Properties;

import javax.annotation.PostConstruct;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

@Stateless(name="PurchaseBean8")
@Remote(Purchase.class)
@Local(PurchaseLocal.class)
public class PurchaseBean implements Purchase {
  
  public boolean processOrder(Order order) {
    boolean paymentOK = payment.processCreditCard(order.getCreditCard());
    return paymentOK;
  }
  
  @PostConstruct
  public void construct() {
    try {
      Properties env = new Properties();
      env.put("java.naming.factory.initial", 
          "org.apache.openejb.client.LocalInitialContextFactory");
      Context c = new InitialContext(env);
      payment = (PaymentLocal)c.lookup("PaymentBean8Local");
    } catch (NamingException ex) {
      ex.printStackTrace();
    }
    
  }
  
  private PaymentLocal payment;
}
