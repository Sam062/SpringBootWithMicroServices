package base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import base.dao.IOfficeDAO;
import base.model.Office;

@SpringBootApplication
public class SpringDataJpaRempCustomGeneraterApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext con=SpringApplication.run(SpringDataJpaRempCustomGeneraterApplication.class, args);
		IOfficeDAO dao=con.getBean(IOfficeDAO.class);

		Office ofc=new Office();
		ofc.setEname("SAM");
		ofc.setEsal(123.4);
		dao.save(ofc);
		System.out.println("*** SAVED ***");
	}

}
