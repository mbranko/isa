package isa.pr20.container;

import isa.pr20.CreditCard;

public interface Payment {

  public boolean processCreditCard(CreditCard card) throws MyException;
  
}
