package base.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "customer_master")
public class CustomerMaster {
	@Id
	@Column(name = "CUST_ID")
	private Integer custId;
	@Column(name = "CUST_NAME")
	private String custName;
	@Column(name = "CUST_MOBILE")
	private Long custMobile;
}
