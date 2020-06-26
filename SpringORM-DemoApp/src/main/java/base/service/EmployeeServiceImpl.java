package base.service;

import java.io.Serializable;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import base.dao.IEMployeeDAO;
import base.model.EmployeeModel;

@Service
public class EmployeeServiceImpl implements IEmployeeService{
	@Autowired
	private IEMployeeDAO dao;

	@Transactional
	public Serializable save(EmployeeModel emp) {
		emp.setEname(emp.getEname()+" MISHRA");
		return dao.save(emp);
	}
}
