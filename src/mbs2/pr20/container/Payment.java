package mbs2.pr20.container;

import mbs2.pr20.CreditCard;

public interface Payment {

  public boolean processCreditCard(CreditCard card) throws MyException;
  
}
