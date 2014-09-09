package isa.pr19.session;

import isa.pr19.entity.CreditCard;

public interface Payment {

  public boolean processCreditCard(CreditCard card);
  
}
