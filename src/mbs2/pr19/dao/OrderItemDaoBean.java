package mbs2.pr19.dao;

import javax.ejb.Local;
import javax.ejb.Stateless;

import mbs2.pr19.entity.OrderItem;

@Stateless
@Local(OrderItemDao.class)
public class OrderItemDaoBean extends GenericDaoBean<OrderItem, Integer> implements OrderItemDao {

}
