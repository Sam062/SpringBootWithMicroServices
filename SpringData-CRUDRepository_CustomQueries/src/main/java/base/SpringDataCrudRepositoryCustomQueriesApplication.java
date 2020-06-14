package base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import base.iContactMaster.ICustomerMaster;

@SpringBootApplication
public class SpringDataCrudRepositoryCustomQueriesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con=SpringApplication.run(SpringDataCrudRepositoryCustomQueriesApplication.class, args);
		ICustomerMaster bean=con.getBean(ICustomerMaster.class);

		//		CustomerMasterEntity entity=bean.findByCustName("SAM");
		//		System.out.println(entity);


		//		CustomerMasterEntity entity=bean.findByCustNameAndCustMobile("SAM", "9695654346");
		//		System.out.println(entity);


		//		CustomerMasterEntity entity=bean.findByCustNameOrCustMobile("SAM", "4444");
		//		System.out.println(entity);






	}

}
