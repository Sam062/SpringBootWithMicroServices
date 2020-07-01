package base.service;

import java.util.List;

import base.entity.ContactDetailsEntity;

public interface IContactService {
	public Boolean saveContact(ContactDetailsEntity entity);
	public List<ContactDetailsEntity> getAllContacts();
	public ContactDetailsEntity getContactByID(Integer contactID);
	public Boolean updateContact(ContactDetailsEntity entity);
	public Boolean deleteContact(Integer contactID);
}
