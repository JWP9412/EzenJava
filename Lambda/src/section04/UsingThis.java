package section04;
/*
 * [클래스의 멤버 사용]
 * 	- 람다식에서 this는 내부적으로 생성되는 익명 객체의 참조가 아니라
 * 		람다식을 실행한 객체의 참조이다.
 * 	- 권고: 외부 클래스에 선언된 필드와 동일한 필드를 람다식에서 선언하지 않는 것이 좋다.
 */
public class UsingThis {
	public int outterField = 10;
	
	void add(int a) {
		this.outterField += a;
		System.out.printf("1. UsingThis.add(%d), outterField(%d)\n", a, this.outterField);
	}
	
	class Inner{
		int innerField =20;
		
		void method() {
			//람다식
			MyFunctionalInterface fi =()->	{
				int outterField = 99;
				int innerField = 77;
				System.out.println("2. outterField : "+outterField); // 람다식에 선언된 필드를 참조
				System.out.println("3. outterField UsingThis.this.outterField: "+
				UsingThis.this.outterField + "\n");// 바깥 객체의 참조를 얻기 위해서는 클래스명.this.필드를 사용
				
				// 람다식에 선언된 필드를 참조하지 못한다. (선언되지 않은 것으로 인식)
				//System.out.println("outterField this.outterField: "+this.outterField + "\n"); 
				
				System.out.println("4. innerField : "+ innerField); // 람다식에 선언된 필드를 참조
				System.out.println("5. innerField this.innerField: "+ this.innerField+"\n");//람다식 내부에서 this.는 Inner 객체를 참조
				System.out.println("6. innerField Inner.this.innerField: "+ Inner.this.innerField+"\n");//람다식 내부에서 this.는 Inner 객체를 참조
			};
			fi.method();
		}
	}
}
