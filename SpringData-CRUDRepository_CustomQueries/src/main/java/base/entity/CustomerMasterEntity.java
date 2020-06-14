package base.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "CUSTOMER_MASTER")
@Entity
public class CustomerMasterEntity{
	@Id
	@Column(name = "CUST_ID")
	private Integer custId;
	@Column(name = "CUST_NAME")
	private String custName;
	@Column(name = "CUST_MOBILE")
	private String custMobile;
}
