package mbs2.pr19.dao;

import java.util.List;

import mbs2.pr19.entity.Product;

public interface ProductDao extends GenericDao<Product, Integer> {

  public List<Product> findProducts(int categoryId);
  
}
