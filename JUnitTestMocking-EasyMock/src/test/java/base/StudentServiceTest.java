package base;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.easymock.EasyMock;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import base.dao.IStudentDao;
import base.exceptions.NoDataFoundException;
import base.model.Contacts;
import base.service.StudentServiceImpl;

public class StudentServiceTest {
	private static StudentServiceImpl service=null;

	@BeforeClass
	public static void init() {
		//********************** CASE 1 ****************************
		// Creation of Proxy
		IStudentDao proxyObj=EasyMock.createMock(IStudentDao.class);

		// Setting behavior for Mock Obj
		EasyMock.expect(proxyObj.getNameById(101)).andReturn("SAM");
		EasyMock.expect(proxyObj.getNameById(102)).andReturn("SHIVAM MISHRA");

		//********************** CASE 2 ****************************
		List<String> list=List.of("SAM","ABC","ZZZ");

		// Setting Behavior for Mock obj
		EasyMock.expect(proxyObj.getAll()).andReturn(list);

		// ******************* CASE 3 ****************************
		Contacts c=new Contacts();
		c.setCid(101);
		c.setCname("SAM");
		c.setCaddr("LKO");
		EasyMock.expect(proxyObj.getByID(101)).andReturn(c);
		EasyMock.expect(proxyObj.getByID(105)).andReturn(null);

		// *************************** --- CASES CLOSED --- ***********************************************

		// creating target class Object
		service=new StudentServiceImpl();
		// Injecting proxy obj to target(Setter Injection)
		service.setDao(proxyObj);
		// Saving Proxy Behavior
		EasyMock.replay(proxyObj);
	}

	@Test
	@Ignore
	public void testFindNameByID_01() {
		String name=service.getNameByID(101);
		assertNotNull(name);
	}

	@Test
	@Ignore
	public void getAllNames() {
		List<String> allNames=service.getAllNames();
		assertNotNull(allNames);
	}

	@Test(expected = NoDataFoundException.class)
	public void getByID() {
		Contacts c=service.getByID(105);
		assertNotNull(c);
	}

}
