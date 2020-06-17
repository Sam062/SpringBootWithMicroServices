package base;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.easymock.EasyMock;
import org.junit.Test;

import base.dao.IContactDao;
import base.exceptions.NoDataFoundException;
import base.model.Contact;
import base.service.ContactServiceImpl;

public class TestContact {
	private static ContactServiceImpl service;
	@Test
	public void testGetNameById() {

		IContactDao proxy=EasyMock.createMock(IContactDao.class);
		EasyMock.expect(proxy.getNameByID(101)).andReturn("SAM");
		EasyMock.expect(proxy.getNameByID(102)).andReturn(null);
		EasyMock.replay(proxy);

		service=new ContactServiceImpl();
		service.setDao(proxy);

		String name=service.getNameByID(101);
		assertNotNull(name);
	}


	@Test
	public void testGetContactByID() {
		Contact contact=new Contact();
		contact.setCid(101);
		contact.setCname("SAM");
		contact.setAddr("LKO");

		IContactDao proxy=EasyMock.createMock(IContactDao.class);
		EasyMock.expect(proxy.getContactByID(101)).andReturn(contact);
		EasyMock.replay(proxy);

		service=new ContactServiceImpl();
		service.setDao(proxy);

		Contact c=service.getContactByID(101);
		assertNotNull(c);
	}
	@Test(expected = NoDataFoundException.class)
	public void testGetContactByID01() {
		Contact contact=new Contact();
		contact.setCid(101);
		contact.setCname("SAM");
		contact.setAddr("LKO");
		
		IContactDao proxy=EasyMock.createMock(IContactDao.class);
		EasyMock.expect(proxy.getContactByID(102)).andReturn(null);
		
		EasyMock.replay(proxy);
		
		service=new ContactServiceImpl();
		service.setDao(proxy);
		
		Contact c=service.getContactByID(102);
		assertNull(c);
	}
	
	@Test
	public void testGetAllNames() {
		List<String> list=List.of("SAM","ABC","XYZ");
		
		IContactDao proxy=EasyMock.createMock(IContactDao.class);
		EasyMock.expect(proxy.getAllNames()).andReturn(list);
		EasyMock.replay(proxy);
		
		service=new ContactServiceImpl();
		service.setDao(proxy);
		
		List<String> names=service.getAllNames();
		assertNotNull(names);
	}
	@Test
	public void testGetAllNames01() {
		IContactDao proxy=EasyMock.createMock(IContactDao.class);
		EasyMock.expect(proxy.getAllNames()).andReturn(null);
		EasyMock.replay(proxy);
		
		service=new ContactServiceImpl();
		service.setDao(proxy);
		
		List<String> names=service.getAllNames();
		assertNull(names);
	}

}
