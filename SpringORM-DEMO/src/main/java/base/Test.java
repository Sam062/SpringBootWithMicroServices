package base;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import base.entity.EmployeeModel;
import base.service.EmployeeServiceIpml;
import base.util.DataSourceUtil;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext acac=new AnnotationConfigApplicationContext(DataSourceUtil.class);
		EmployeeServiceIpml service=acac.getBean(EmployeeServiceIpml.class);
		
		EmployeeModel emp=new EmployeeModel();
		emp.setEid(103);
		emp.setEname("XXXX");
		emp.setEsal(111.1);
		
		service.save(emp);
		System.out.println("*** AGAIN SAVED ***");
		
		acac.close();
	}

}
