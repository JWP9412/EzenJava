package books;

public class BookExample2 {

	public static void main(String[] args) {
		EBook ebook = new EBook("???޷? ??","????","???ҿ?",20.5);
		
		
		ebook.setTitle("????å!");
		System.out.println("name : " + ebook.name);
		System.out.println("category : " + ebook.category);
		System.out.println("author : " + ebook.author);
		System.out.println("price : " + ebook.price);
		System.out.println("title : "+ebook.getTitle());
		System.out.println();
		
		System.out.println(ebook);
		
		
	}

}
