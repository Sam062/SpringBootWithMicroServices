package base.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class UserEntity {
	@Id
	@GeneratedValue
	private Integer userID;
	private String userName;
	@OneToMany(mappedBy = "user")
	private List<Address> userAddr;

}
