package base;

import static org.junit.Assert.assertNotNull;

import org.easymock.EasyMock;
import org.junit.Test;

import base.dao.IStudentDao;
import base.service.StudentServiceImpl;

public class StudentServiceTest {

	@Test
	public void testFindNameByID_01() {

		// Creation of Proxy
		IStudentDao proxyObj=EasyMock.createMock(IStudentDao.class);
		
		// Setting behavior for ProxyObj
		EasyMock.expect(proxyObj.getNameById(101))
		.andReturn("SAM");
		
		EasyMock.expect(proxyObj.getNameById(102))
		.andReturn("SHIVAM MISHRA");

		EasyMock.replay(proxyObj);
		
		StudentServiceImpl service=new StudentServiceImpl();
		service.setDao(proxyObj);

		String name=service.getNameByID(101);
		assertNotNull(name);
	}

}
