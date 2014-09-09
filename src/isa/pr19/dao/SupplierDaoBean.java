package isa.pr19.dao;

import isa.pr19.entity.Supplier;

import javax.ejb.Local;
import javax.ejb.Stateless;

@Stateless
@Local(SupplierDao.class)
public class SupplierDaoBean extends GenericDaoBean<Supplier, Integer> implements SupplierDao {

}
