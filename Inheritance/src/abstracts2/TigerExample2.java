package abstracts2;

public class TigerExample2 {

	public static void main(String[] args) {
		Animal animal = new Cat();
		animal.breath();
		
		Cat cat = (Cat)animal;
		cat.breath();
		
		//�θ� ��ü�� �ڽ� ��ü�� ĳ������ �ϸ�
		//���� ������ �߻��Ѵ�
		Tiger tiger =(Tiger)animal;
		tiger.breath();
	}

	
	

}
