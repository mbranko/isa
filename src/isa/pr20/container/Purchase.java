package isa.pr20.container;

import isa.pr20.CreditCard;
import isa.pr20.PurchaseOrder;

public interface Purchase {
  
  public boolean processOrder(PurchaseOrder order, CreditCard card);

}
