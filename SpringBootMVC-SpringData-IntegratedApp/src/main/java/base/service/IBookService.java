package base.service;

import java.util.List;

import base.bindings.Book;
import base.entity.BookEntity;

public interface IBookService  {
	public Boolean saveBook(Book book);
	public List<BookEntity> getAllBooks();

}
