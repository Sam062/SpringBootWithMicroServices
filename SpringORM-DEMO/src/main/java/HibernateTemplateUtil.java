package base.util;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;

@Configuration
public class HibernateTemplateUtil {
	@Autowired
	private SessionFactory sf;
	
	@Bean
	public HibernateTemplate hibernateTemplate() {
		HibernateTemplate ht=new HibernateTemplate();
		ht.setSessionFactory(sf);
		return ht;
	}

}