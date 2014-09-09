package isa.pr19.dao;

import isa.pr19.entity.OrderItem;

import javax.ejb.Local;
import javax.ejb.Stateless;

@Stateless
@Local(OrderItemDao.class)
public class OrderItemDaoBean extends GenericDaoBean<OrderItem, Integer> implements OrderItemDao {

}
