package abstracts2;

public class Fish extends Animal {
	Fish() {
		this.kind = "�����";
	}

	@Override
	public void move() {
		System.out.println("������ ���ģ��.");
	}

	public void swim() {
		System.out.println("������ ���ģ��.");
	}

	@Override
	public void sound() {
		System.out.println("������ �����Ÿ���?");
	}

	@Override
	public void breath() {
		System.out.println("������ �ư��̷� ���ӿ� �ִ� ��ҷ� ȣ���� �Ѵ�");
	}
}
