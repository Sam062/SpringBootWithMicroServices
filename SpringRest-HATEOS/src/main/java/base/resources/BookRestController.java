package base.resources;

import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import base.binding.Book;

@RestController
public class BookRestController {

	@GetMapping(value = "/book/{bid}", produces = "application/json")
	public Book showBook(@PathVariable("bid")Integer bid) {

		Book b=new Book(bid,"JAVA","AUthorName");

		Link link = WebMvcLinkBuilder
				.linkTo(WebMvcLinkBuilder.methodOn(BookRestController.class).getAllBooks())
				.withRel("All-Books");
		b.add(link);
		
		return b;
	}


	@GetMapping(value = "/getAll",produces = "application/json")
	public List<Book> getAllBooks() {

		Book b1=new Book(102, "abc", "xyz");
		Book b2=new Book(103, "bcd", "XXX");
		Book b3=new Book(104, "cde", "YYY");
		Book b4=new Book(105, "def", "ZZZ");
		return List.of(b1,b2,b3,b4);
	}


}
