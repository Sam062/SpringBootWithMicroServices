package base.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name = "CONTCT_DTLS")
public class ContactDetailsEntity {
	@Id
	@Column(name = "CNTCT_ID")
	@GeneratedValue
	private Integer contactID;

	@Column(name = "CNTCT_NM")
	private String contactName;

	@Column(name = "CNTCT_NMBR")
	private Long contactNumber;

	@Column(name = "CNTCT_EMAIL")
	private String contactEmail;

	@Column(name = "CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date createdDate;


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_DATE")
	private Date updatedDate;
}
