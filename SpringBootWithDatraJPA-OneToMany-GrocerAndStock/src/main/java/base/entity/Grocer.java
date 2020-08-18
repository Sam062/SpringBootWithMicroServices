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

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Grocer {
	@Id
	@GeneratedValue
	private Integer grocerID;
	private String grocerName;

	@OneToMany(mappedBy = "grocerObj",
			cascade = CascadeType.ALL,
			orphanRemoval = true)
	private List<Stock> stock;

}
