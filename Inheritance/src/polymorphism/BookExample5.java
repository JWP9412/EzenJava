package polymorphism;
/*
 * 1. 부모의 타입으로 자식객체가 자동 타입 변환
 * 2. 부모의 객체를 자식타입으로 받을수 없다.
 */

public class BookExample5 {

	public static void main(String[] args) {
		Book book = new Book("고전","문화유산","무명씨",0.5);
		EBook ebook = new EBook("진달래 꽃","시집","김소월",20.5,"전자책");
		Novel novel = new Novel("태백산맥","소설","조정래",20.5,"해방 이후의 이념과 민중의 한 ");
		
		System.out.println(book);
		System.out.println(ebook);
		System.out.println(novel);
		
		printBookInfo(book);
		printBookInfo(ebook);
		printBookInfo(novel);
		
	
	}
	static void printBookInfo(Book book1) {
		System.out.println("[도서정보]");
		System.out.println(book1);
		
	}

}
