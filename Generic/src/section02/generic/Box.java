package section02.generic;
/*
 * ���ʸ��� Ŭ������ ������ �� Ÿ���� ��������� ����
 * 
 * ���ʸ��� Ŭ������ ������ �� classname<T>�� ǥ��
 * -  T �� ���� Ÿ��
 * - <T> ������ Ÿ���� �� �� �ִٴ� �ǹ� (T = Type)
 * -  T = (String | Class | Object | ...)
 * 
 * 
 * ���ʸ� ����
 * class Classname<Type>{
 * }
 * 
 * ���ʸ� ����
 *  Classname<Type> = new Classname<Type>
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
