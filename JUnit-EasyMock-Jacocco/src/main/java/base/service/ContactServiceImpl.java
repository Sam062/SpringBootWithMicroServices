package base.service;

import java.util.List;

import base.dao.IContactDao;
import base.exceptions.NoDataFoundException;
import base.model.Contact;

public class ContactServiceImpl implements IContactService {

	private IContactDao dao;
	public void setDao(IContactDao dao) {
		this.dao = dao;
	}

	public String getNameByID(Integer id) {
		String name=dao.getNameByID(id);
		name+=" UPDATED";
		return name;
	}

	public Contact getContactByID(Integer id) {
		Contact c=dao.getContactByID(id);
		if(c==null)
			throw new NoDataFoundException();

		return c;
	}

	public List<String> getAllNames() {
		List<String> list=dao.getAllNames();
		if(list==null)
			return null;
		return list;
	}

}
