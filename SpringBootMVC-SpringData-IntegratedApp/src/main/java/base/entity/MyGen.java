package base.entity;

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
		StringBuilder prefix=new StringBuilder().append("BK_ID-");
		try {
			Connection con=session.connection();
			PreparedStatement ps=con.prepareStatement("SELECT bk_id_gen.nextval from dual");
			ResultSet rs=ps.executeQuery();
			if(rs.next())
				prefix.append(String.valueOf(rs.getInt(1)).toString());

		} catch (Exception e) {
		}
		return prefix.toString();
	}

}
