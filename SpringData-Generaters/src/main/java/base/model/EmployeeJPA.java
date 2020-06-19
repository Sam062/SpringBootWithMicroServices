package base.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Data
@Entity
public class EmployeeJPA {
	@Id
	@SequenceGenerator(name = "abc",sequenceName = "employeejpa_id",allocationSize = 2)
	@GeneratedValue(generator = "abc",strategy = GenerationType.SEQUENCE)
	private Integer eid;
	private String ename;
	private String addr;
}
