package by.exercices.dzmitry.parkhomenka.les06_1.ex1;

public class Book {
	private String bookName;
	private int bookPrice;
	
	public Book() {};
	
	public Book(String bookName, int bookPrice) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	public int getBookPrice() {
		return bookPrice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
		result = prime * result + bookPrice;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		if (bookPrice != other.bookPrice)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}
	
}
