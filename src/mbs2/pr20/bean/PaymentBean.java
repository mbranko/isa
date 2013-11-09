package mbs2.pr20.bean;

import javax.annotation.Resource;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.transaction.UserTransaction;

import mbs2.pr20.CreditCard;

import static javax.ejb.TransactionManagementType.BEAN;

@Stateless(name="Payment20Bean")
@Local(PaymentLocal.class)
@Remote(Payment.class)
@TransactionManagement(BEAN)
public class PaymentBean implements Payment {

  @Resource
  private UserTransaction tx;
  
  public boolean processCreditCard(CreditCard card) {
    try {
      tx.begin();
      if (somethingWentWrong()) {
        tx.rollback();
        return false;
      }
      tx.commit();
      return true;
    } catch (Exception ex) {
      return false;
    }
  }
  
  private boolean somethingWentWrong() {
    return Math.random() > 0.5;
  }
}
