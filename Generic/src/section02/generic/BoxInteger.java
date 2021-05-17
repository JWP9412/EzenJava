package section02.generic;
/*
 * 제너릭은 클래스를 정의할 때 classname<T>로 표기
 * -<T> 임의의 타입이 올 수 있다는 의미 (T = Type)
 * 
 * 제너릭은 클래스를 선언할 때 타입을 명시적으로 지정
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
