package base.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import base.model.Address;
import base.model.UserEntity;
import base.repository.AddressMasterRepo;
import base.repository.UserMasterRepo;

@RestController
public class UserController {

	@Autowired
	private UserMasterRepo userRepo;
	@Autowired
	private AddressMasterRepo addr;

	@PostMapping(value = "/save",consumes = "application/json",produces = "application/json")
	public ResponseEntity<UserEntity> saveData(@RequestBody UserEntity user){

		UserEntity save = userRepo.save(user);
		System.out.println("***********************");
		System.out.println(save);

		return new ResponseEntity<UserEntity>(save,HttpStatus.CREATED);
	}
	@GetMapping(value = "/findAll/{id}",produces = "application/json")
	public ResponseEntity<Address> findAll(@PathVariable("id")String code){
		Address findByAddressCode = addr.findByAddressCode(code);
		return new ResponseEntity<Address>(findByAddressCode,HttpStatus.OK);
	}

}
