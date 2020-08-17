package base.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import base.dao.AddressDaoImpl;
import base.dao.UserDaoImpl;
import base.entity.Address;
import base.entity.UserEntity;

@Service
public class UserService {
	@Autowired
	private UserDaoImpl dao;
	@Autowired
	private AddressDaoImpl addDao;

	public UserEntity saveUse(UserEntity user) {
		List<Address> addr=user.getUserAddress();
		List<Address> collect = addr.stream().map(ob->{
			ob.setUser(user);
			return ob;
		}).collect(Collectors.toList());
		user.setUserAddress(collect);
		return dao.save(user);
	}
	
	public LinkedHashMap<String, Object> findByLoc(String loc) {
		Address addr = addDao.findByLoc(loc);
		LinkedHashMap<String, Object> map = new LinkedHashMap<>();
		map.put("USER ID", addr.getUser().getUserID());
		map.put("USER NAME", addr.getUser().getUserName());
		map.put("LOC", addr.getLoc());
		return map;
	}


}
