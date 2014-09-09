package isa.pr19.dao;

import isa.pr19.entity.Product;

import java.util.List;

public interface ProductDao extends GenericDao<Product, Integer> {

  public List<Product> findProducts(int categoryId);
  
}
