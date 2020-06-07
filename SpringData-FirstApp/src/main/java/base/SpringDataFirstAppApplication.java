package base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import base.model.CustomerMaster;
import base.repo.CrudRepo;

@SpringBootApplication
public class SpringDataFirstAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con=SpringApplication.run(SpringDataFirstAppApplication.class, args);
		CrudRepo repo=con.getBean(CrudRepo.class);
		
		
		CustomerMaster c=new CustomerMaster();
		c.setCustId(103);
		c.setCustName("HARI");
		c.setCustMobile(8181861314l);
		
		repo.save(c);
		
	}

}
