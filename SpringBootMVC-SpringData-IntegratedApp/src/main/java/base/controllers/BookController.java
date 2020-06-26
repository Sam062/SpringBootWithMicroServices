package base.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import base.bindings.Book;
import base.entity.BookEntity;
import base.service.IBookService;

@Controller
public class BookController {
	@Autowired
	IBookService service;
	
	@GetMapping({"/","/home"})
	public String showHomePage(Model model) {
		Book book=new Book();
		model.addAttribute("book", book);
		return "home";
	}
	
	@PostMapping("/addBook")
	public String saveBook(@ModelAttribute("book")Book book,RedirectAttributes attribute) {
		Boolean isBookSaved=service.saveBook(book);
		String msg="";
		if(isBookSaved)
			msg="Book Added Successfully";
		else
			msg="Adding Book Failed";
		attribute.addFlashAttribute("msg", msg);
		return "redirect:/home";
	}
	
	@GetMapping("/getAll")
	public String getAllBooks(Model model) {
		List<BookEntity> list=service.getAllBooks();
		
		model.addAttribute("list", list);
		
		return "data";
	}

}
