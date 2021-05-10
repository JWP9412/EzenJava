package books;

public class EBook extends Book {
	private String title;

	public EBook() {}
	
	public EBook(String name, String category, String author, double price) {
		super(name, category, author, price);
	}

	public EBook(String name, String category, String author, double price, String title) {
		super(name, category, author, price);
		this.setTitle(title);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = "CD-" + title;
	}

	public String toString() {
		String str = String.format("[EBook] name(%s), category(%s), author(%s), price(%f),title(%s)\n", name, category,
				author, price, title);
		return str;
	}

}
