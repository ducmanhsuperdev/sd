package abtract3;
import java.util.Scanner;
public class HardcoverBook extends Book {
	protected int numberofpage;
	protected Scanner sc= new Scanner(System.in);

	
	public HardcoverBook(int id, String title, String author,int numberofpage, long price) {
		super(id, title, author, price);
		this.numberofpage=numberofpage;
	}


	public HardcoverBook() {
		super();
	}


	public void input() {
		System.out.println("enter id: ");
		super.id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter author: ");
		super.author=sc.nextLine();
		System.out.println("enter title: ");
		super.title=sc.nextLine();
		System.out.println("enter price: ");
		super.price=sc.nextLong();
		System.out.println("enter numberofpage: ");
		numberofpage=sc.nextInt();
		
	}

	
	public String ToString() {
		
		return "id: "+super.id
				+"\nauthor: "+super.author
				+"\ntitle: "+super.title
				+"\nprice: "+super.price
				+"numberofpage: "+numberofpage;
			   
	}

}
