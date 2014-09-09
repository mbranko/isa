package isa.pr20.container;

import static javax.ejb.TransactionAttributeType.REQUIRED;
import static javax.ejb.TransactionManagementType.CONTAINER;
import isa.pr20.CreditCard;
import isa.pr20.PurchaseOrder;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionManagement;

@Stateless(name="Purchase20Container")
@Remote(Purchase.class)
@Local(PurchaseLocal.class)
@TransactionManagement(CONTAINER)
public class PurchaseBean implements Purchase {
  
  @TransactionAttribute(REQUIRED)
  public boolean processOrder(PurchaseOrder order, CreditCard card) {
    boolean paymentOK = false;
    try {
      paymentOK = payment.processCreditCard(card);
    } catch (MyException ex) {
      paymentOK = false;
    }
    return paymentOK;
  }
  
  @EJB
  private PaymentLocal payment;
}
