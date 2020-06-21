package base.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
public class Office {
	
	@Id
	@GenericGenerator(name = "abc",strategy = "base.model.MyGenerater")
	@GeneratedValue(generator = "abc")
	private String eid;
	private String ename;
	private Double esal;

}
