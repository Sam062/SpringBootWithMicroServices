package base.dao;

import java.io.Serializable;

import base.model.EmployeeModel;

public interface IEMployeeDAO {
	public Serializable save(EmployeeModel emp);

}
