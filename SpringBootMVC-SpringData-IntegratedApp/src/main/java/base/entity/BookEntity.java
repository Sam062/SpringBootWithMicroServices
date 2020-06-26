package base.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
public class BookEntity {
	@Id
	@GenericGenerator(name = "bk_id_gen",strategy = "base.entity.MyGen")
	@GeneratedValue(generator = "bk_id_gen")
	private String bookID;
	private String bookName;
	private String author;
	private Double price;
}
