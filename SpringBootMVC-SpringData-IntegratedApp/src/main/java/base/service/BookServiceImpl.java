package base.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import base.bindings.Book;
import base.entity.BookEntity;
import base.repo.IBookRepo;

@Service
public class BookServiceImpl implements IBookService {
	@Autowired
	private IBookRepo repo;

	public Boolean saveBook(Book book) {

		BookEntity bookEntity=new BookEntity();
		BeanUtils.copyProperties(book, bookEntity);

		BookEntity savedEntity=repo.save(bookEntity);

		return (savedEntity.getBookID())!=null;
	}
	public List<BookEntity> getAllBooks() {
		List<BookEntity> list=repo.findAll();
		return list;
	}

}
