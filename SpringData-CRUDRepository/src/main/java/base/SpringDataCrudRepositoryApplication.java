package base;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import base.entity.CustomerMasterEntity;

@SpringBootApplication
public class SpringDataCrudRepositoryApplication {

	//***************************************FIND BY ID 
	//	public static void main(String[] args) {
	//		ConfigurableApplicationContext con=SpringApplication.run(SpringDataCrudRepositoryApplication.class, args);
	//
	//		ICustomerMaster icm=con.getBean(ICustomerMaster.class);
	//		Optional<CustomerMasterEntity> opt=icm.findById(101);
	//		CustomerMasterEntity entity=null;
	//		if(opt.isPresent())
	//		{	
	//			entity=opt.get();
	//			System.out.println("*******************************");
	//			System.out.println(entity);
	//			System.out.println("*******************************");
	//
	//		}
	//		else
	//			System.out.println("NOT FOUND");
	//	}

	//**********************************FIND ALL BY ID's
	//	public static void main(String[] args) {
	//		ConfigurableApplicationContext con=SpringApplication.run(SpringDataCrudRepositoryApplication.class, args);
	//
	//		ICustomerMaster icm=con.getBean(ICustomerMaster.class);
	//		Iterable<CustomerMasterEntity> entities = icm.findAllById(Arrays.asList(101,102));
	////		findAllById.forEach(System.out::println);
	//		entities.forEach(findAllById->{
	//			System.out.println(findAllById);
	//		});
	//	}





	//	**********************************FIND ALL
	//		public static void main(String[] args) {
	//			ConfigurableApplicationContext con=SpringApplication.run(SpringDataCrudRepositoryApplication.class, args);
	//	
	//			ICustomerMaster icm=con.getBean(ICustomerMaster.class);
	//			 Iterable<CustomerMasterEntity> allEntities = icm.findAll();
	//			 allEntities.forEach(entity->{
	//				 System.out.println(entity);
	//			 });
	//		}


	//	**********************************SAVE AND UPDATE DATA
	//	public static void main(String[] args) {
	//		ConfigurableApplicationContext con=SpringApplication.run(SpringDataCrudRepositoryApplication.class, args);
	//
	//		ICustomerMaster icm=con.getBean(ICustomerMaster.class);
	//		
	//		CustomerMasterEntity entity=new CustomerMasterEntity();
	//		entity.setCustId(105);
	//		entity.setCustName("HARI");
	//		entity.setCustMobile("8181861314");
	//		icm.save(entity);
	//	}


	//**********************************SAVE ALL DATA
	//	public static void main(String[] args) {
	//		ConfigurableApplicationContext con=SpringApplication.run(SpringDataCrudRepositoryApplication.class, args);
	//
	//		ICustomerMaster icm=con.getBean(ICustomerMaster.class);
	//
	//		CustomerMasterEntity entity1=new CustomerMasterEntity();
	//		entity1.setCustId(106);
	//		entity1.setCustName("MUM");
	//		entity1.setCustMobile("8004737178");
	//
	//		CustomerMasterEntity entity2=new CustomerMasterEntity();
	//		entity2.setCustId(107);
	//		entity2.setCustName("PAA");
	//		entity2.setCustMobile("9935416983");
	//
	//		icm.saveAll(Arrays.asList(entity1,entity2));
	//
	//	}



	//**********************************FIND BY COLUMN NAME
	//	public static void main(String[] args) {
	//		ConfigurableApplicationContext con=SpringApplication.run(SpringDataCrudRepositoryApplication.class, args);
	//
	//		ICustomerMaster icm=con.getBean(ICustomerMaster.class);
	//		CustomerMasterEntity entity = icm.findByCustName("SAM");
	//		System.out.println("---------------------"+entity);
	//	}



	//**********************************FIND BY MULTIPLE COLUMN NAMES
	//	public static void main(String[] args) {
	//		ConfigurableApplicationContext con=SpringApplication.run(SpringDataCrudRepositoryApplication.class, args);
	//		ICustomerMaster icm=con.getBean(ICustomerMaster.class);
	//		
	//		CustomerMasterEntity entity = icm.findByCustNameOrCustMobile("SAM", "123");
	//		System.out.println("---------------------"+entity);
	//	}



	//**********************************FIND BY NAME PREFIX(STARTS WITH ..)
	public static void main(String[] args) {
		ConfigurableApplicationContext con=SpringApplication.run(SpringDataCrudRepositoryApplication.class, args);
		ICustomerMaster icm=con.getBean(ICustomerMaster.class);
		List<CustomerMasterEntity> list=icm.findByCustNameStartsWith("SS");
		list.forEach(entity->System.out.println(entity));
	}
}
