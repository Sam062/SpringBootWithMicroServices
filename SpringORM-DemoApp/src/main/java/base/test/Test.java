package base.test;

import java.io.Serializable;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import base.config.AppConfig;
import base.model.EmployeeModel;
import base.service.IEmployeeService;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		IEmployeeService service=ac.getBean(IEmployeeService.class);
		
		EmployeeModel e=new EmployeeModel();
		e.setEname("SAMMMMM ");
		e.setEsal(123.4);
		e.setLoc("JDSP");

		Serializable id=service.save(e);
		System.out.println("************* SAVED "+id+" *****************");
		ac.close();
	}

}
