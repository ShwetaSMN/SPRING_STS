package com.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.rest.entities.Book;

@Component
public class BookService {
	
	private static List<Book> list=new ArrayList<>();
	
	static {
		list.add(new Book(12,"JaVA Reference","XYZ"));
		list.add(new Book(59,"C++ Reference","hjko"));
		list.add(new Book(1652,"C Complete Reference","VHHJ"));
	}
	
	//get All books
	
	public List<Book> getAllBooks() {
		return list;
		
	}
	
	//get single book by ID
	
	public Book getBookById(int id) {
		
		Book book=null;
		
		book= list.stream().filter(e->e.getId()==id).findFirst().get();
		return book;
		
	}

}
