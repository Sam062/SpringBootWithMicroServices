package base.service;

import java.io.Serializable;

import base.model.EmployeeModel;

public interface IEmployeeService {
	public Serializable save(EmployeeModel emp);
}
