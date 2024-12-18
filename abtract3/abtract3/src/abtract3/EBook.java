package abtract3;
import java.util.Scanner;
public class EBook extends Book implements Digital {
	protected Scanner sc= new Scanner(System.in);
	protected String format;
	protected double filesizeMB;
	

	
	public EBook() {
		super();
	}
	


	public EBook(int id, String title, String author,String format,double filesizeMB, long price) {
		super(id, title, author, price);
		this.format= format;
		this.filesizeMB=filesizeMB;
	}

	public String getFormat() {
		return format;
	}



	public void setFormat(String format) {
		this.format = format;
	}



	public double getFilesizeMB() {
		return filesizeMB;
	}



	public void setFilesizeMB(double filesizeMB) {
		this.filesizeMB = filesizeMB;
	}



	public void setFilesizeMB(int filesizeMB) {
		this.filesizeMB = filesizeMB;
	}



	public void isBigBook() {
		
		
	}

	
	public double getfilesizeMB() {
		return filesizeMB;
		
		
	}

	@Override
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
		System.out.println("enter format: ");
		format=sc.nextLine();
		sc.nextLine();
		System.out.println("enter FileSizeMB: ");
		filesizeMB=sc.nextDouble();
		
	}

	@Override
	public String ToString() {
		return "id: "+super.id
				+"\nauthor: "+super.author
				+"\ntitle: "+super.title
				+"\nprice: "+super.price
				+"\nformat: "+ format
				+"\nFilesizeMB: "+filesizeMB;
		
		
	}

}
