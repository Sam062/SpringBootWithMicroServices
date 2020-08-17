package base.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import base.entity.Address;

public interface AddressDaoImpl extends JpaRepository<Address, Serializable>{
	Address findByLoc(String loc);

}
