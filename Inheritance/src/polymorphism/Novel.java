package polymorphism;

public class Novel extends Book {
	private String summary;

	public Novel() {}
	
	public Novel(String name, String category, String author, double price) {
		super(name, category, author, price);
	}

	public Novel(String name, String category, String author, double price, String summary) {
		super(name, category, author, price);
		this.setSummary(summary);
	}

	
	public String toString() {
		String str = String.format("[Novel] name(%s), category(%s), author(%s), price(%f),story(%s)\n", name, category,
				author, price, summary);
		return str;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = "NOVEL : "+summary;
	}

}
