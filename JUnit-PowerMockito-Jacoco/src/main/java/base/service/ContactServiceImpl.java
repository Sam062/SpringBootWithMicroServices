package base.service;

import java.util.List;

import base.dao.IContactDao;
import base.exceptions.NoDatFoundException;
import base.model.Contact;

public class ContactServiceImpl implements IContactService {

	private IContactDao dao;
	
	
	public void setDao(IContactDao dao) {
		this.dao = dao;
	}

	public String findNameByID(Integer id) {
		String name=dao.findNameByID(id);
		name=name+" UPDATED";
		return name;
	}

	public List<String> findAllName() {
		List<String> list=dao.findAllName();
		if(list==null)
			throw new NoDatFoundException();
		
		return list;
	}

	public Contact findContactByID(Integer id) {
		Contact c=dao.findContactByID(id);
		if(c==null)
			return null;
		return c;
	}

}
