package com.oignon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oignon.modal.Book;
import com.oignon.service.BookService;

@RestController
@RequestMapping("/user")
public class BookController 
{
	// DI
	@Autowired
	BookService bookService;
		
		// REST API
		// 1. send the record.,  http://localhost:8081/insertBook
		@PostMapping("/insertBook")
		public Book insertBook(@RequestBody Book book)
		{
			return bookService.insertBook(book);
		}
		
		// 2. send the data.,
		@PostMapping("/insertBooks")
		public List<Book> insertBooks(@RequestBody List<Book> book)
		{
			List<Book> book1 = bookService.insertBooks(book);
			return book1;
		}
		
		// 3. select the record.,
		@GetMapping("/getBook/{bId}")
		public Book getBook(@PathVariable Integer bId)
		{
			return bookService.getBook(bId);
		}
		
		// 4. select the data.,
		@GetMapping("/getBooks")
		public List<Book> getBooks()
		{
			return bookService.getBooks();
		}
		
		// 5. update the record.,
		@PutMapping("/updateBook/{bId}")
		public Book updateBook(@PathVariable Integer bId, @RequestBody Book book)
		{
			return bookService.updateBook(bId,book);
		}
		
		// 6. delete the record.,
		@DeleteMapping("/deleteBook/{bId}")
		public String deleteBook(@PathVariable Integer bId)
		{
			bookService.deleteBook(bId);
			return "Book "+bId+" deleted successfully.,";
		}
		
		// 7. delete the data.,
		@DeleteMapping("/deleteBooks")
		public String deleteBooks()
		{
			bookService.deleteBooks();
			return "All the books are deleted from the database,";
		}
}
