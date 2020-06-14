package base;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import base.entity.CustomerMasterEntity;

public interface ICustomerMaster extends JpaRepository<CustomerMasterEntity, Serializable> {
	
	public List<CustomerMasterEntity> findAll(org.springframework.data.domain.Sort sort);

}
