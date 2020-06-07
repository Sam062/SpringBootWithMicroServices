package base.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import base.model.CustomerMaster;

@Repository
public interface CrudRepo extends JpaRepository<CustomerMaster, Serializable> {
	

}
