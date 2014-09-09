package isa.pr19.session;

import isa.pr19.entity.CreditCard;
import isa.pr19.entity.PurchaseOrder;

public interface Purchase {
  
  public boolean processOrder(PurchaseOrder order, CreditCard card);

}
