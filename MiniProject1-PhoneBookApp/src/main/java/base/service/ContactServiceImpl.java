package base.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
	public List<ContactModel> getAllContacts() {

		List<ContactDetailsEntity> list=repo.findAll();
		List<ContactModel> listOfContactModel=list.stream().map(entity->{
			ContactModel model=new ContactModel();
			BeanUtils.copyProperties(entity, model);
			return model;
		}).collect(Collectors.toList());
		return listOfContactModel;
	}

	@Override
	public ContactModel getContactByID(Integer contactID) {
		Optional<ContactDetailsEntity> entity=repo.findById(contactID);
		ContactModel contactModel=null;
		if(entity.isPresent()) {
			ContactDetailsEntity contactDetailEntity=entity.get();

			contactModel=new ContactModel();

			BeanUtils.copyProperties(contactDetailEntity, contactModel);
		}
		return contactModel;
	}

	@Override
	public Boolean deleteContact(Integer contactID) {
		Optional<ContactDetailsEntity> op=repo.findById(contactID);
		if(op.isPresent()) {
			ContactDetailsEntity entity=op.get();
			if(entity!=null) {
				repo.delete(entity);
				return true;
			}
		}
		return false;
	}

}
