package base.model;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class MyGen implements IdentifierGenerator{
	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
	
		String prefix="SAM-ID-";
		String suffix="";
		try {
			Connection con=session.connection();
			PreparedStatement ps=con.prepareStatement("SELECT idgen.nextval from dual");
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				int nextVal=rs.getInt(1);
				suffix=String.valueOf(nextVal);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prefix+suffix;
	}

}
