package base.dao;

import java.util.List;

import base.model.Contact;

public interface IContactDao {

	public String findNameByID(Integer id);

	public List<String> findAllName();

	public Contact findContactByID(Integer id);

}
