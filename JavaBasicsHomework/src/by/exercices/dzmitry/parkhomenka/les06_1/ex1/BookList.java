package by.exercices.dzmitry.parkhomenka.les06_1.ex1;

import java.util.ArrayList;
import java.util.List;

public class BookList {
	private List<Book> bookList = new ArrayList<Book>();
	
	public BookList() {};
	
	public List<Book> getBookList(){
		return bookList;
	}
	
	public void addBookToList(Book book) {
		bookList.add(book);
	}
	
	public boolean deleteFromList(Book book) {
		return bookList.remove(book);
	}
	
	public Book findBook(String name) {
		for (Book book: bookList) {
			if  (book.getBookName().equals(name)) {
				return book;
			} 
		}
		return null;
	}

}
