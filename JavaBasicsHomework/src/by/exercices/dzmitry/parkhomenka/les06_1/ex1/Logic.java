package by.exercices.dzmitry.parkhomenka.les06_1.ex1;

import java.util.List;

public class Logic {
	public void showAllExistentBooks(List<Book> bookList) {
		showStartMessage();
		for (Book book: bookList) {
			showEachBook(book);
		}
	}
	
	public void showStartMessage() {
		System.out.println("The list of existing books is the following: ");
	}
	
	public void showEachBook(Book book) {
		System.out.println(book);
	}

	public void showFoundBook(Book foundBook) {
		System.out.println(foundBook);
	}
	
	public void showDivisionalLine() {
		System.out.println("--------------------------------------------------------------------------------");
	}
}
