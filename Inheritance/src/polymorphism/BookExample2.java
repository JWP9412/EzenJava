package polymorphism;
/*
 * 1. �θ��� Ÿ������ �ڽİ�ü�� �ڵ� Ÿ�� ��ȯ
 * 2. �θ��� ��ü�� �ڽ�Ÿ������ ������ ����.
 */

public class BookExample2 {

	public static void main(String[] args) {
		Book book = new Book("����","��ȭ����","����",0.5);
		//EBook book = new Book("����","��ȭ����","����",0.5);
		//Ebook xbook1 = book;
		//Ebook xbook = (Ebook)book;
		//System.out.println(xbook);
		Book ebook = new EBook("���޷� ��","����","��ҿ�",20.5,"����å");
		Book novel = new Novel("�¹���","�Ҽ�","������",20.5,"�ع� ������ �̳�� ������ �� ");
		
		System.out.println(book);
		System.out.println(ebook);
		System.out.println(novel);
			
		
	}

}
