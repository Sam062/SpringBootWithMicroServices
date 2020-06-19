package base.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;

import base.dao.IContactDao;
import base.exceptions.NoDatFoundException;
import base.model.Contact;
import base.service.ContactServiceImpl;

public class TestFindBy {

	@Test
	public void findNameByID01() {
		IContactDao daoProxy=PowerMockito.mock(IContactDao.class);

		when(daoProxy.findNameByID(101)).thenReturn("SAM");

		ContactServiceImpl service=new ContactServiceImpl();
		service.setDao(daoProxy);

		String name=service.findNameByID(101);
		assertNotNull(name);
	}
	@Test
	public void findContactByID() {

		IContactDao daoProxy=PowerMockito.mock(IContactDao.class);

		Contact c=new Contact();
		c.setCid(101);
		c.setCname("SAM");
		c.setAddr("LKO");

		when(daoProxy.findContactByID(101)).thenReturn(c);

		ContactServiceImpl service=new ContactServiceImpl();
		service.setDao(daoProxy);

		Contact c1=service.findContactByID(101);
		assertNotNull(c1);
	}
	@Test
	public void findContactByID01() {

		IContactDao daoProxy=PowerMockito.mock(IContactDao.class);

		when(daoProxy.findContactByID(102)).thenReturn(null);

		ContactServiceImpl service=new ContactServiceImpl();
		service.setDao(daoProxy);

		Contact c1=service.findContactByID(102);
		assertNull(c1);
	}
	@Test
	public void findAllName01() {

		IContactDao daoProxy=PowerMockito.mock(IContactDao.class);

		List<String> names=List.of("SAM","ABC","ZZZ");

		when(daoProxy.findAllName()).thenReturn(names);

		ContactServiceImpl service=new ContactServiceImpl();
		service.setDao(daoProxy);
		List<String> names1=service.findAllName();
		assertNotNull(names1);
	}
	@Test(expected = NoDatFoundException.class)
	public void findAllName02() {
		IContactDao daoProxy=PowerMockito.mock(IContactDao.class);
		when(daoProxy.findAllName()).thenReturn(null);
		
		ContactServiceImpl service=new ContactServiceImpl();
		service.setDao(daoProxy);
		List<String> names1=service.findAllName();
		assertNull(names1);
	}


}
