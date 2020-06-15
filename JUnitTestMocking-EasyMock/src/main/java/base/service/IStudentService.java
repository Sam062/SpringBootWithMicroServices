package base.service;

import java.util.List;

import base.model.Contacts;

public interface IStudentService {
	
	public String getNameByID(Integer id);
	
	public List<String> getAllNames();
	
	public Contacts getByID(Integer id);
	

}
