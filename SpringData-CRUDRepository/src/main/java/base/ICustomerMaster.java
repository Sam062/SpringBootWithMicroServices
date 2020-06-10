package base;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import base.entity.CustomerMasterEntity;

public interface ICustomerMaster extends CrudRepository<CustomerMasterEntity, Serializable> {
	public CustomerMasterEntity findByCustName(String s);
}

