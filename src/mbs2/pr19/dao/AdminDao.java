package mbs2.pr19.dao;

import mbs2.pr19.entity.Admin;

public interface AdminDao extends GenericDao<Admin, Integer> {

  public Admin login(String username, String password); 
  
}
