package base.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import base.model.EmployeeModel;

@Configuration
@EnableTransactionManagement
@PropertySource("classpath:app.properties")
@ComponentScan("base")
public class AppConfig {
	@Autowired
	private Environment env;

	@Bean
	public DriverManagerDataSource ds() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName(env.getProperty("db.driver"));
		ds.setUrl(env.getProperty("db.url"));
		ds.setUsername(env.getProperty("db.username"));
		ds.setPassword(env.getProperty("db.password"));

		return ds;
	}

	@Bean
	public LocalSessionFactoryBean sf() {
		LocalSessionFactoryBean sf=new LocalSessionFactoryBean();
		sf.setDataSource(ds());
		sf.setAnnotatedClasses(EmployeeModel.class);
		sf.setHibernateProperties(props());
		return sf;
	}

	private Properties props() {
		Properties p=new Properties();
		p.setProperty("hibernate.dialect", env.getProperty("orm.dialect"));
		p.setProperty("hibernate.show_sql", env.getProperty("orm.show_sql"));
		p.setProperty("hibernate.hbm2ddl.auto", env.getProperty("orm.hbm2ddl.auto"));

		return p;
	}

	@Bean
	public HibernateTemplate ht() {
		HibernateTemplate ht=new HibernateTemplate();
		ht.setSessionFactory(sf().getObject());
		return ht;
	}

	@Bean
	public HibernateTransactionManager tx() {
		HibernateTransactionManager tx=new HibernateTransactionManager();
		tx.setSessionFactory(sf().getObject());
		return tx;
	}
}
