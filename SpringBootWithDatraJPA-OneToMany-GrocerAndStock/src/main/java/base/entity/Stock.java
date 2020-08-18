package base.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
public class Stock {
	@Id
	@GeneratedValue
	private Integer stockID;
	private String item;
	
	@ManyToOne()
	@JoinColumn(name = "grocerID")
	private Grocer grocerObj;

}
