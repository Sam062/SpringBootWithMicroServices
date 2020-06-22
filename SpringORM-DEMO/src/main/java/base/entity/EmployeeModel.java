package base.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class EmployeeModel {
	@Id
	private Integer eid;
	private String ename;
	private Double esal;

}
