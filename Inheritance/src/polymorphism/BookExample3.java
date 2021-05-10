package polymorphism;
/*
 * 1. �θ��� Ÿ������ �ڽİ�ü�� �ڵ� Ÿ�� ��ȯ
 * 2. �θ��� ��ü�� �ڽ�Ÿ������ ������ ����.
 */

public class BookExample3 {

	public static void main(String[] args) {
		Book book = new Book("����","��ȭ����","����",0.5);
		//EBook book = new Book("����","��ȭ����","����",0.5);
		//Ebook xbook1 = book;
		//Ebook xbook = (Ebook)book;
		//System.out.println(xbook);
		EBook ebook = new EBook("���޷� ��","����","��ҿ�",20.5,"����å");
		Novel novel = new Novel("�¹���","�Ҽ�","������",20.5,"�ع� ������ �̳�� ������ �� ");
		
		System.out.println(book);
		System.out.println(ebook);
		System.out.println(novel);
		
		printBookInfo(book);
		printEBookInfo(ebook);
		printNovelBookInfo(novel);
		
	
	}
	static void printBookInfo(Book book) {
		System.out.println("[��������]");
		System.out.println(book);
		
	}
	static void printEBookInfo(EBook book) {
		System.out.println("[����å����]");
		System.out.println(book);
		
	}
	static void printNovelBookInfo(Novel book) {
		System.out.println("[�Ҽ�å����]");
		System.out.println(book);
		
	}

}
