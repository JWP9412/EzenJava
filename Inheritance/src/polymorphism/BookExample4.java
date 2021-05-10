package polymorphism;
/*
 * 1. �θ��� Ÿ������ �ڽİ�ü�� �ڵ� Ÿ�� ��ȯ
 * 2. �θ��� ��ü�� �ڽ�Ÿ������ ������ ����.
 */

public class BookExample4 {

	public static void main(String[] args) {
		Book book = new Book("����","��ȭ����","����",0.5);
		EBook ebook = new EBook("���޷� ��","����","��ҿ�",20.5,"����å");
		Novel novel = new Novel("�¹���","�Ҽ�","������",20.5,"�ع� ������ �̳�� ������ �� ");
		
		System.out.println(book);
		System.out.println(ebook);
		System.out.println(novel);
		
		printBookInfo(book, "[��������]");
		printBookInfo(ebook, "[����å����]");
		printBookInfo(novel,"[�Ҽ�å����]");
		
	
	}
	static void printBookInfo(Book book1,String caption) {
		System.out.println(caption);
		System.out.println(book1);
		
	}

}
