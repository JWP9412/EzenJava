package section02.generic;
/*
 * ���ʸ��� Ŭ������ ������ �� classname<T>�� ǥ��
 * -<T> ������ Ÿ���� �� �� �ִٴ� �ǹ� (T = Type)
 * 
 * ���ʸ��� Ŭ������ ������ �� Ÿ���� ��������� ����
 * 
 */

public class Box<T> { // T = (int | float | double | String | Class)
	private T name;
	
	public void set(T name) {
		this.name = name;
		}
	
	public T get() {
		return this.name;
	}
}
