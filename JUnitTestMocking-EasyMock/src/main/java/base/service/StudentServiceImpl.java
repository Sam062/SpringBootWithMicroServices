package base.service;

import base.dao.IStudentDao;

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

}
