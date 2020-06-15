package base.service;

import java.util.List;

import base.dao.IStudentDao;
import base.exceptions.NoDataFoundException;
import base.model.Contacts;

public class StudentServiceImpl implements IStudentService {

	private IStudentDao dao;

	public void setDao(IStudentDao dao) {
		this.dao = dao;
	}

	@Override
	public String getNameByID(Integer id) {
		String name=dao.getNameById(id);

		String formattedName=name.toUpperCase()+" UPDATED";
		return formattedName;
	}

	@Override
	public List<String> getAllNames() {
		List<String> list=dao.getAll();

		if(!list.isEmpty())
			return list;
		return null;
	}

	@Override
	public Contacts getByID(Integer id) {
		Contacts con=dao.getByID(id);
		if(con==null)
			throw new NoDataFoundException();
		return con;
	}
	
	
}
