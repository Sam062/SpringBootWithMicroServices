package base.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import base.dao.EmployeeDAOImpl;
import base.entity.EmployeeModel;

@Repository
public class EmployeeServiceIpml {
	@Autowired
	private EmployeeDAOImpl dao;
	
	@Transactional
	public void save(EmployeeModel emp) {
		dao.save(emp);
	}

}
