package mbs2.pr19.session;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

import mbs2.pr19.entity.CreditCard;
import mbs2.pr19.entity.PurchaseOrder;

@Stateless
@Remote(Purchase.class)
@Local(PurchaseLocal.class)
public class PurchaseBean implements Purchase {
  
  @Interceptors(Logger.class)
  public boolean processOrder(PurchaseOrder order, CreditCard card) {
    boolean paymentOK = payment.processCreditCard(card);
    return paymentOK;
  }
  
  @EJB
  private PaymentLocal payment;
}
