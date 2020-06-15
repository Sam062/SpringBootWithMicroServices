package base.dao;

import java.util.List;

import base.model.Contacts;

public interface IStudentDao {
	
	String getNameById(Integer id);
	
	List<String> getAll();
	
	public Contacts getByID(Integer id);

}
