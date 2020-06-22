package base.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import base.entity.EmployeeModel;

@Repository
public class EmployeeDAOImpl {
	@Autowired
	private HibernateTemplate ht;
	
	public void save(EmployeeModel emp) {
		ht.save(emp);
	}
	

}
