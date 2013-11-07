package mbs2.pr19.dao;

import javax.ejb.Local;
import javax.ejb.Stateless;

import mbs2.pr19.entity.Supplier;

@Stateless
@Local(SupplierDao.class)
public class SupplierDaoBean extends GenericDaoBean<Supplier, Integer> implements SupplierDao {

}
