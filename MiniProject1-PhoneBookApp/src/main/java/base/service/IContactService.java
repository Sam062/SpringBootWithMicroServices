package base.service;

import java.util.List;

import base.entity.ContactDetailsEntity;
import base.model.ContactModel;

public interface IContactService {
	public Boolean saveContact(ContactModel model);
	public List<ContactModel> getAllContacts();
	public ContactModel getContactByID(Integer contactID);
	public Boolean updateContact(ContactModel model);
	public Boolean deleteContact(Integer contactID);
}
