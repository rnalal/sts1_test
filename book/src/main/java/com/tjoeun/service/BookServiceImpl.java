package com.tjoeun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tjoeun.domain.Book;
import com.tjoeun.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepository bookRepository;

	@Override
	public List<Book> getAllBookList() {
		List<Book> bookList = bookRepository.getAllBookList();
		System.out.println(bookList.size());
		return bookList;
	}

	@Override
	public List<Book> getBookListByCategory(String category) {
		List<Book> booksByCategory = bookRepository.getBookListByCategory(category);
		return booksByCategory;
	}
	
}
