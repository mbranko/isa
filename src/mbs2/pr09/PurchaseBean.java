package mbs2.pr09;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless(name="PurchaseBean9")
@Remote(Purchase.class)
@Local(PurchaseLocal.class)
public class PurchaseBean implements Purchase {
  
  public boolean processOrder(Order order) {
    boolean paymentOK = payment.processCreditCard(order.getCreditCard());
    return paymentOK;
  }
  
  @EJB
  private PaymentLocal payment;
}
