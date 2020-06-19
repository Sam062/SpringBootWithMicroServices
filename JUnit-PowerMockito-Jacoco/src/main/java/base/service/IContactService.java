package base.service;

import java.util.List;

import base.model.Contact;

public interface IContactService {

	public String findNameByID(Integer id);

	public List<String> findAllName();

	public Contact findContactByID(Integer id);
}
