package mbs2.pr19.session;

import mbs2.pr19.entity.CreditCard;
import mbs2.pr19.entity.PurchaseOrder;

public interface Purchase {
  
  public boolean processOrder(PurchaseOrder order, CreditCard card);

}
