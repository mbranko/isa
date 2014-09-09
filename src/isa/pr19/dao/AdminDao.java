package isa.pr19.dao;

import isa.pr19.entity.Admin;

public interface AdminDao extends GenericDao<Admin, Integer> {

  public Admin login(String username, String password); 
  
}
