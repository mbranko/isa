package mbs2.pr20.container;

import mbs2.pr20.CreditCard;
import mbs2.pr20.PurchaseOrder;

public interface Purchase {
  
  public boolean processOrder(PurchaseOrder order, CreditCard card);

}
