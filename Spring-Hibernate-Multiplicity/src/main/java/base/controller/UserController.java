package base.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import base.entity.UserEntity;
import base.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService service;

	@PostMapping(value = "/saveUser", consumes = "application/json")
	public ResponseEntity<String> userSave(@RequestBody UserEntity user) {

		UserEntity saveUse = service.saveUse(user);
		if(saveUse!=null)
			return new ResponseEntity<>("DATA SAVED :: ",HttpStatus.CREATED);
		return new ResponseEntity<>("DATA NOT SAVED",HttpStatus.BAD_REQUEST);
	}

	@GetMapping(value = "/getData/{loc}",produces = "application/json")
	public ResponseEntity<Map<String, Object>> findByLocation(@PathVariable("loc") String loc){
		LinkedHashMap<String, Object> entity = service.findByLoc(loc);
		if(entity!=null)
			return new ResponseEntity<>(entity,HttpStatus.ACCEPTED);
		return new ResponseEntity<>(null,HttpStatus.NO_CONTENT);
	}

}
