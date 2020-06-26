package base.bindings;

import lombok.Data;

@Data
public class Book {
	private String bookID;
	private String bookName;
	private String author;
	private Double price;
}
