package mbs2.pr19.dao;

import java.util.List;

import mbs2.pr19.entity.Category;

public interface CategoryDao extends GenericDao<Category, Integer>{
  
  public List<Category> findRoots();
  public Category loadWithChildren(int categoryId);
  
}
