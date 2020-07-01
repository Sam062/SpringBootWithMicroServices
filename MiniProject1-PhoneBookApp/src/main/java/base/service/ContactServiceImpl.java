package base.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import base.entity.ContactDetailsEntity;
import base.model.ContactModel;
import base.repo.ContactRepository;

@Service
public class ContactServiceImpl implements IContactService {

	@Autowired
	private ContactRepository repo;

	@Override
	public Boolean saveContact(ContactModel model) {

		ContactDetailsEntity entity=new ContactDetailsEntity();

		BeanUtils.copyProperties(model, entity);
		ContactDetailsEntity result=repo.save(entity);

		return (result!=null);
	}

	@Override
	public List<ContactDetailsEntity> getAllContacts() {
		return repo.findAll();
	}

	@Override
	public ContactDetailsEntity getContactByID(Integer contactID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateContact(ContactDetailsEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteContact(Integer contactID) {
		// TODO Auto-generated method stub
		return null;
	}

}
