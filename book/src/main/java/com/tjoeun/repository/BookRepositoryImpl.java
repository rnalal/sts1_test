package com.tjoeun.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tjoeun.domain.Book;

@Repository
public class BookRepositoryImpl implements BookRepository {
	
	private List<Book> listOfBooks = new ArrayList<Book>();
	
	public BookRepositoryImpl() {
		Book book1 = new Book("ISBN-13", "난생처음 자바", 29000);
		Book book2 = new Book("ISBN-14", "로마인이야기", 10000);
		Book book3 = new Book("ISBN-15", "실무 엑셀", 21000);
		
		book1.setAuthor("우재남");
		book1.setDescription("이 책은 초보자에게 어려운 자바 개념을 다양한 삽화와 도식을 통해 시각적으로 설명하여 비전공자도 쉽게 이해할 수 있도록 구성하였습니다.");
		book1.setPublisher("한빛아카데미");
		book1.setCategory("IT서적");
		book1.setUnitsInStock(200);
		book1.setReleaseDate("2023/06/30");
		
		book2.setAuthor("시오노나나미");
		book2.setDescription("저자가 직접 취재하고 정리해가면서 얻은 풍부한 실증적 지식을 바탕으로, 인물에 초점을 맞춰 로마에 관한 이야기를 생생하게 펼쳐나가는 방대한 인문 교양서다.");
		book2.setPublisher("한길사");
		book2.setCategory("인문교양");
		book2.setUnitsInStock(100);
		book2.setReleaseDate("1997/08/25");
		
		book3.setAuthor("정태호");
		book3.setDescription("엑셀 업무 자동화를 위해 필수적으로 알아야 할 매크로 및 VBA 핵심기능 예제 27개와 업무에 바로 활용할 수 있는 프로젝트형 실무 예제 14개를 수록했다. ");
		book3.setPublisher("이지스퍼블리싱");
		book3.setCategory("IT서적");
		book3.setUnitsInStock(150);
		book3.setReleaseDate("2023/05/15");
		
		listOfBooks.add(book1);
		listOfBooks.add(book2);
		listOfBooks.add(book3);

		
	}

	@Override
	public List<Book> getAllBookList() {
		return listOfBooks;
	}
	
	@Override
	public List<Book> getBookListByCategory(String category) {
		List<Book> booksByCategory = new ArrayList<Book>();
		
		for(int i = 0; i  < listOfBooks.size(); i++) {
			Book book = listOfBooks.get(i);
			// 파라미터로 전달받은 category 와 일치하는 분야의 책만 추가함
			if(category.equalsIgnoreCase(book.getCategory())) {
				booksByCategory.add(book);
				System.out.println(book.getCategory());
			}
		}
		
		return booksByCategory;
	}

}
