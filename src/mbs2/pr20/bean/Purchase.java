package mbs2.pr20.bean;

import mbs2.pr20.CreditCard;
import mbs2.pr20.PurchaseOrder;

public interface Purchase {
  
  public boolean processOrder(PurchaseOrder order, CreditCard card);

}
