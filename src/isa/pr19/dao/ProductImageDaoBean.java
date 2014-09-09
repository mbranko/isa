package isa.pr19.dao;

import isa.pr19.entity.ProductImage;

import javax.ejb.Local;
import javax.ejb.Stateless;

@Stateless
@Local(ProductImageDao.class)
public class ProductImageDaoBean extends GenericDaoBean<ProductImage, Integer> implements ProductImageDao {

}
