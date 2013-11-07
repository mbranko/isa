package mbs2.pr19.dao;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.NamedQuery;
import javax.persistence.Query;

import mbs2.pr19.entity.Product;

@Stateless
@Local(ProductDao.class)
@NamedQuery(
    name="findProductsForCategory",
    query="SELECT p FROM Product p WHERE p.category.id=:categoryId")
@SuppressWarnings("unchecked")
public class ProductDaoBean extends GenericDaoBean<Product, Integer> implements ProductDao {
  
  public List<Product> findProducts(int categoryId) {
    Query q = em.createNamedQuery("findProductsForCategory");
    q.setParameter("categoryId", categoryId);
    List<Product> result = q.getResultList();
    return result;
  }
  
}
