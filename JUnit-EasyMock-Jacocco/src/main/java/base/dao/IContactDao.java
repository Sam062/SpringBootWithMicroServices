package base.dao;

import java.util.List;

import base.model.Contact;

public interface IContactDao {
	public String getNameByID(Integer id);
	public Contact getContactByID(Integer id);
	public List<String> getAllNames();
}
