package by.exercices.dzmitry.parkhomenka.les06_1.ex1;

public class Library {

	public static void main(String[] args) {
		//создание списка книг
		BookList bookList = new BookList();
		
		//создание обьекта класса Logic содержащего нужные методы
		Logic action = new Logic();
		
		//создание книг
		Book java = new Book("Java", 90);
		Book cleanCode = new Book("Clean Code", 30);
		Book algorythm = new Book("Algorythms", 50);
		Book twoBrothers = new Book("Two Brothers", 20);
		
		//внесение книг в список
		bookList.addBookToList(java);
		bookList.addBookToList(cleanCode);
		bookList.addBookToList(algorythm);
		bookList.addBookToList(twoBrothers);
		
		//вывод всех имеющихся книг в спике на консоль
		action.showAllExistentBooks(bookList.getBookList());
		action.showDivisionalLine();
		
		//поиск книги и вывод результата на консоль
		Book foundBook = bookList.findBook("Java");
		Book foundBook2 = bookList.findBook("Algorythms");
		action.showFoundBook(foundBook);
		action.showFoundBook(foundBook2);
		action.showDivisionalLine();
		
		//удаление книги из списка
		bookList.deleteFromList(cleanCode);
		bookList.deleteFromList(algorythm);
		
		//вывод списка на консоль после удаления книг
		action.showAllExistentBooks(bookList.getBookList());
	}

}
