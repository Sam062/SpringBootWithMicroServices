package base.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import base.model.Address;

public interface AddressMasterRepo extends JpaRepository<Address, Serializable> {
	Address findByAddressCode(String code);

}
