package section02.generic;
/*
 * ���ʸ��� Ŭ������ ������ �� classname<T>�� ǥ��
 * -<T> ������ Ÿ���� �� �� �ִٴ� �ǹ� (T = Type)
 * 
 * ���ʸ��� Ŭ������ ������ �� Ÿ���� ��������� ����
 * 
 */

public class BoxInteger { // T = (int | float | double | String | Class)
	private Integer name;
	
	public void set(Integer name) {
		this.name = name;
		}
	
	public Integer get() {
		return this.name;
	}
}
