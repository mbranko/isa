package mbs2.pr19.dao;

import javax.ejb.Local;
import javax.ejb.Stateless;

import mbs2.pr19.entity.PurchaseOrder;

@Stateless
@Local(PurchaseOrderDao.class)
public class PurchaseOrderDaoBean extends GenericDaoBean<PurchaseOrder, Integer> implements PurchaseOrderDao {

}
