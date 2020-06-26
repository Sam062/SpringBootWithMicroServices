package base.dao;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import base.model.EmployeeModel;

@Repository
public class EmployeeDaoImpl implements IEMployeeDAO {
	@Autowired
	private HibernateTemplate ht;
	@Override
	public Serializable save(EmployeeModel emp) {
		return ht.save(emp);
	}
}
