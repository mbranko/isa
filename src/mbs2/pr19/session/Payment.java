package mbs2.pr19.session;

import mbs2.pr19.entity.CreditCard;

public interface Payment {

  public boolean processCreditCard(CreditCard card);
  
}
