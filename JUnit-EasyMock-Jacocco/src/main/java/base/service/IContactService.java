package base.service;

import java.util.List;

import base.model.Contact;

public interface IContactService {
	public String getNameByID(Integer id);
	public Contact getContactByID(Integer id);
	public List<String> getAllNames();

}
