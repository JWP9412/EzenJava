package remocon;

public class SearchFinder2Example {

	public static void main(String[] args) {
		SearchFinder2 sf = new SearchFinder2();
		sf.search("�˻�����");
		sf.find("���ͳ��ּ�");

		Searchable2 s2 = sf;
		s2.search("���ͳ��ּ�2");
		//s2.find("�˻�����2);
		
		Finder finder = sf;
		finder.find("�˻�����3");
		//finder.search("���ͳ��ּ�3");
		
		/*
		 * ������ü�� �������̽� ������ ���� ��
		 * �������̽��� ���������� �����ȴ�
		 * ��) �Ǽ��� -> ������
		 * ������Ƽ�� Ÿ���� ���� �����ϴ�
		 * 
		 * �Ǽ��� ������ ������ �Ǽ��� ������ ���������� ��ȯ �Ǵ� �Ͱ� ����
		 */
		int x =(int)3.14f;
		System.out.println("x : " + x);
		
	}

}
