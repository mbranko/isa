package mbs2.pr19.dao;

import mbs2.pr19.entity.PurchaseOrder;
import mbs2.pr19.entity.User;

public interface UserDao extends GenericDao<User, Integer> {

  public User login(String username, String password);
  public void add(User user, PurchaseOrder order);

}
