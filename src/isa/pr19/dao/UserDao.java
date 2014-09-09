package isa.pr19.dao;

import isa.pr19.entity.PurchaseOrder;
import isa.pr19.entity.User;

public interface UserDao extends GenericDao<User, Integer> {

  public User login(String username, String password);
  public void add(User user, PurchaseOrder order);

}
