package base.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue
	private Integer addressID;
	private String addressCode;
	@ManyToOne
	private UserEntity user;
	public Address(Integer addressID, String addressCode, UserEntity user) {
		super();
		this.addressID = addressID;
		this.addressCode = addressCode;
		this.user = user;
	}
	public Address() {
		super();
	}
	
	

}
