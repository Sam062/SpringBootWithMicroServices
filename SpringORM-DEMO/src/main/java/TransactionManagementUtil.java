package base.util;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;

@Configuration
public class TransactionManagementUtil {
	@Autowired
	private SessionFactory sf;
	
	@Bean
	public HibernateTransactionManager transactionMngmnt() {
		HibernateTransactionManager htm=new HibernateTransactionManager();
		htm.setSessionFactory(sf);
		return htm;
	}


}
