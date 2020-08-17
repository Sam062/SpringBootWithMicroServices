package base.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class UserEntity {
	@Id
	@GeneratedValue
	private Integer userID;
	private String userName;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private List<Address> userAddress;

}
