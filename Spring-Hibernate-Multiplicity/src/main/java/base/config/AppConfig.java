//package base.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.hibernate5.HibernateTemplate;
//import org.springframework.orm.hibernate5.HibernateTransactionManager;
//import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import base.dao.UserEntity;
//
////@Configuration
////@ComponentScan("base")
////@EnableTransactionManagement
//public class AppConfig {
//
//	@Bean
//	public DriverManagerDataSource dataSource() {
//		 DriverManagerDataSource dmds = new DriverManagerDataSource();
//		 dmds.setUrl("jdbc:h2:mem:testdb");
//		 dmds.setDriverClassName("org.h2.Driver");
//		 dmds.setUsername("user");
//		 
//		 return dmds;
//	}
//
//	@Bean
//	public LocalSessionFactoryBean sf() {
//		LocalSessionFactoryBean sbf = new LocalSessionFactoryBean();
//
//		sbf.setDataSource(dataSource());
//		sbf.setAnnotatedClasses(UserEntity.class);
//		return sbf;
//	}
//
//	@Bean
//	public HibernateTemplate ht() {
//		HibernateTemplate ht = new HibernateTemplate();
//		ht.setSessionFactory(sf().getObject());
//		return ht;
//	}
//
//	@Bean
//	public HibernateTransactionManager tm() {
//		HibernateTransactionManager tm = new HibernateTransactionManager();
//		tm.setSessionFactory(sf().getObject());
//		return tm;
//	}
//
//}
