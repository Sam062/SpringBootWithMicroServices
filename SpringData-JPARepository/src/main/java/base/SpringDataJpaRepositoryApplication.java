package base;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import base.entity.CustomerMasterEntity;

@SpringBootApplication
public class SpringDataJpaRepositoryApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con=SpringApplication.run(SpringDataJpaRepositoryApplication.class, args);
		ICustomerMaster bean=con.getBean(ICustomerMaster.class);

		// ************************************* USING SORT *************************************
		// FIND BY -Ascending, Descending
		//		List<CustomerMasterEntity> ent=bean.findAll(Sort.by("custName").ascending());
		//		ent.forEach(entity->System.out.println(entity));

		// ********************************** USING PAGINATION *************************************
		// Formula to Get totalPages = (totalRecords/pageSize) + (totalRecords%pageSize) > 0 ? 1 : 0;
		PageRequest p=PageRequest.of(0, 10);  // (pageNo, pageSize) and pageNo starts with Zero
		
		Page<CustomerMasterEntity> page=bean.findAll(p);
		
		System.out.println("*******************************************");
		System.out.println("Total pages="+page.getTotalPages());
		
		List<CustomerMasterEntity> list=page.getContent();
		list.forEach(entity->System.out.println(entity));
		System.out.println("*******************************************");
	}

}
