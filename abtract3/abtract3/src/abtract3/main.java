package abtract3;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		
	BookManager book1=new BookManager();
	Scanner sc=new Scanner(System.in);
	
	System.out.println("          MENU          ");
	System.out.println("1.add book");
	System.out.println("2.search book by id");
	System.out.println("3.print list book");
	System.out.println("4.totalPrice");
	System.out.println("5.TotalFileSize");
	System.out.println("6.end");
	
	boolean tn=true;
	while(tn) {

		System.out.println("enter your choice, pls!!!");
		int choose =sc.nextInt();
		switch(choose) {
		case 1:
			System.out.println("EBook or HardcoverBook???");
			System.out.println("1.EBook");
			System.out.println("2.HardcoverBook");
			int c=sc.nextInt();
			Book book;
			if(c==1) {
				book=new EBook();			
				}else {
					book=new HardcoverBook();
				}
			book.input();
			book1.addBook(book);
			break;
		case 2:
			System.out.println("enter id: ");
			int id=sc.nextInt();
			Book book2=book1.searchBook(id);
			if(book2==null) {
				System.out.println("this book is not exis");
			}else {
				System.out.println(book2.ToString());
			}
			break;
		case 3:
			book1.displayBook();
			break;
		case 4:
			book1.totalprice();
			break;
		case 5:
			book1.totalfilesizeMB();
			break;
		case 6:
			System.out.println("End");
			break;
			default:
				tn=false;
		
			
		}
	}

}


}
