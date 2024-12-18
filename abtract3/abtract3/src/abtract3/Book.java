package abtract3;

public abstract class Book {
	protected int id;
	protected String title;
	protected String author;
	protected long price;
	
	public Book() {
		super();
	}
	
	public Book(int id, String title, String author, long price) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public abstract void input();
	public abstract String ToString();
	
	
	

}
