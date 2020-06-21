package base.model;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class MyGenerater implements IdentifierGenerator{
	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {

		String prefix="SAM-OFC-";
		String suffix="";
		try {
			String sql="SELECT my_id_gen.nextval from dual";
			Connection con=session.connection();
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				int nextVal=rs.getInt(1);
				suffix=String.valueOf(nextVal);
			}


		} catch (Exception e) {
			e.printStackTrace();
		}

		return prefix+suffix.toUpperCase();
	}
}
