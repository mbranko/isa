package isa.pr10;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

@Stateless(name="PaymentBean10")
@Local(PaymentLocal.class)
@Remote(Payment.class)
public class PaymentBean implements Payment {

  @Interceptors(Logger.class)
  public boolean processCreditCard(CreditCard card) {
    return Math.random() < 0.5f;
  }
}
