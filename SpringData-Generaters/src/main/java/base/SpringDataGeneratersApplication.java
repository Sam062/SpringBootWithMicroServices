package base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import base.dao.IEmployeeDao;
import base.model.EmployeeJPA;

@SpringBootApplication
public class SpringDataGeneratersApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con=SpringApplication.run(SpringDataGeneratersApplication.class, args);
		IEmployeeDao dao=con.getBean(IEmployeeDao.class);
		
		EmployeeJPA emp=new EmployeeJPA();
		emp.setEname("BBB");
		emp.setAddr("HYD");

		EmployeeJPA entity=dao.save(emp);
		System.out.println("*-----*--*-*-*-*-*--*-***-**-*-*-*-*-");
		System.out.println(entity);
	}

}
