package mbs2.pr19.dao;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.NamedQuery;
import javax.persistence.Query;

import mbs2.pr19.entity.Admin;

@Stateless
@Local(AdminDao.class)
@NamedQuery(
    name="loginAdmin",
    query="SELECT a FROM Admin a WHERE a.username=:username AND a.password=:password")
public class AdminDaoBean extends GenericDaoBean<Admin, Integer> implements AdminDao {
  
  public Admin login(String username, String password) {
    Query q = em.createNamedQuery("loginAdmin");
    q.setParameter("username", username);
    q.setParameter("password", password);
    Admin a = (Admin)q.getSingleResult();
    return a;
  }
  
}
