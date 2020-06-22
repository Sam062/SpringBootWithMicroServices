package base.util;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import base.entity.EmployeeModel;

@Configuration
public class SessionFactoryUtil {
	@Autowired
	private DataSource ds;

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sf=new LocalSessionFactoryBean();
		sf.setDataSource(ds);
		sf.setHibernateProperties(properties());
		sf.setAnnotatedClasses(EmployeeModel.class);
		return sf;
	}

	private Properties properties() {
		Properties p=new Properties();
		p.setProperty("hibernate.show_sql", "true");
		p.setProperty("hibernate.format_sql", "true");
		p.setProperty("hibernate.hbm2ddl.auto", "update");
		return p;
	}

}
