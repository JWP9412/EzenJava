package books;

public class BookExample2 {

	public static void main(String[] args) {
		EBook ebook = new EBook("진달래 꽃","시집","김소월",20.5);
		
		
		ebook.setTitle("전자책!");
		System.out.println("name : " + ebook.name);
		System.out.println("category : " + ebook.category);
		System.out.println("author : " + ebook.author);
		System.out.println("price : " + ebook.price);
		System.out.println("title : "+ebook.getTitle());
		System.out.println();
		
		System.out.println(ebook);
		
		
	}

}
