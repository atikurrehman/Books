package com.library.Books.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.Books.Entity.Book;

@Service
public class BookService {
	
	
	@Autowired
	BookRepository bookRepo;

	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookRepo.findAll();
	}

}
