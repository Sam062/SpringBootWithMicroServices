package base.service;

import java.util.List;

import base.entity.ContactDetailsEntity;
import base.model.ContactModel;

public interface IContactService {
	public Boolean saveContact(ContactModel model);
	public List<ContactDetailsEntity> getAllContacts();
	public ContactDetailsEntity getContactByID(Integer contactID);
	public Boolean updateContact(ContactDetailsEntity entity);
	public Boolean deleteContact(Integer contactID);
}
