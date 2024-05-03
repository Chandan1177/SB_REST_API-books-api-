package com.example.demo.controller;

import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.entity.Books;

@RestController
public class BookController {
	@GetMapping(value="/books", produces= {
			MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE
	})
	public ResponseEntity<Books> getBook(){
		Book book1=new Book(1,"java",1000.00);		
		Book book2=new Book(2,"paython",500.00);
		Books books=new Books();
		books.setBooks(Arrays.asList(book1,book2));
		return new ResponseEntity<Books>(books,HttpStatus.OK);
	}
}
