/*
 * �߻� Ŭ������ new�� ����Ͽ� ��ü�� ������ �� ����.
 * �ݵ�� �߻� Ŭ������ ����� Ŭ������ ���� ��ü�� �����ؾ� �Ѵ�
 */

package abstracts2;

/*public class Animal {
	public void move() {
		System.out.println("������ �����δ�");
	}
}*/

public abstract class Animal {
	public String kind = "����";
	public abstract void move();
	/*
	 * [�߻� �޼ҵ�]
	 * �߻� �޼ҵ�� ������ ������ ���� �ʴ�.
	 * ����� Ŭ�������� ������ �ؾ� �Ѵ�.
	 */
	
	// [�Ϲ� �޼ҵ�]
	public abstract void sound();
	
	public void breath() {
		System.out.println(kind+"�� ȣ���� �Ѵ�");
	}
}
