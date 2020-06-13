package base;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import base.entity.CustomerMasterEntity;

public interface ICustomerMaster extends CrudRepository<CustomerMasterEntity, Serializable> {
	public CustomerMasterEntity findByCustName(String s);
	public CustomerMasterEntity findByCustNameAndCustMobile(String name,String mobile);
	public CustomerMasterEntity findByCustNameOrCustMobile(String name,String mobile);
	public List<CustomerMasterEntity> findByCustNameStartsWith(String prefix);

}

