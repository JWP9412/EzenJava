package abstracts2;

public class Insect extends Animal {
	Insect(){
	this.kind = "����";
	}
	@Override
	public void move() {
		System.out.println("������ ���.");
	}

	public void crawl() {
		System.out.println("������ ���.");
	}

	@Override
	public void sound() {
		System.out.println("������ ���� �Ҹ��� ����");
	}
}
