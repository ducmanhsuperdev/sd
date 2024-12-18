package abtract3;
import java.util.Scanner;
public class BookManager {
	protected Book[] books;
	protected int size;
	protected Scanner sc= new Scanner(System.in);
	public BookManager() {
		books= new Book[10000];
		int size = 0;
	}
	public BookManager(Book[] books, int size) {
		super();
		this.books = books;
		this.size = size;
	}
	
	public Book[] getBooks() {
		return books;
	}
	public void setBooks(Book[] books) {
		this.books = books;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void addBook(Book book) {
		if(searchBook(book.getId())!=null) {
			System.out.println("this book is exist ");
			return;
		}else {
		books[size]=book;
		size++; 
		}
	}
	public Book searchBook(int id) {
		for (int i = 0; i < size; i++) {
			if(books[i].id==id) {
				return books[i];
			}
			
		}
		return null ;
		
	}
	public void displayBook() {
		for (int i = 0; i < size; i++) {
			System.out.println(books[i].ToString());
			System.out.println("------------------annhon");
			
		}
	}
	public long totalprice() {
		int sum=0;
		for (int i = 0; i < size; i++) {
			sum+=books[i].getPrice();
		}
		return sum;
	}
	
	
	public double totalfilesizeMB() {
		double sum2=0;
		for (int i = 0; i < size; i++) {
			if(books[i] instanceof EBook) {
				sum2+=((EBook)books[i]).getfilesizeMB();
			}
			
		}
		return sum2;
	}

	
	

}
