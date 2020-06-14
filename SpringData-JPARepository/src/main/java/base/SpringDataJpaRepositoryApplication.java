package base;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Sort;

import base.entity.CustomerMasterEntity;

@SpringBootApplication
public class SpringDataJpaRepositoryApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con=SpringApplication.run(SpringDataJpaRepositoryApplication.class, args);
		ICustomerMaster bean=con.getBean(ICustomerMaster.class);
		
		// FIND BY -Ascending, Descending
		List<CustomerMasterEntity> ent=bean.findAll(Sort.by("custName").ascending());
		ent.forEach(entity->System.out.println(entity));
	}

}
