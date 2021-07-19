package section02.generic;
/*
 * 제너릭은 클래스를 선언할 때 타입을 명시적으로 지정
 * 
 * 제너릭은 클래스를 정의할 때 classname<T>로 표기
 * -  T 는 참조 타입
 * - <T> 임의의 타입이 올 수 있다는 의미 (T = Type)
 * -  T = (String | Class | Object | ...)
 * 
 * 
 * 제너릭 정의
 * class Classname<Type>{
 * }
 * 
 * 제너릭 선언
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
