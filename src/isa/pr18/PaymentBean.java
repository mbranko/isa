package isa.pr18;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

@Stateless
@Local(PaymentLocal.class)
@Remote(Payment.class)
public class PaymentBean implements Payment {

  @Interceptors(Logger.class)
  public boolean processCreditCard(CreditCard card) {
    return true;
  }
}
