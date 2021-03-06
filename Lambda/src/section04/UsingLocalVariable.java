package section04;
/*
 * 메소드 안에 선언된 로컬 변수
 * 	- 로컬변수를 람다식에서 참조하게 되면
 * 	  그 로컬변수는 final특성을 갖게 된다.
 * 	- final : 선언된 값을 변경할 수 없다.
 * 	- 로컬변수 : 메소드의 파라미터, 메소드에서 선언된 변수
 * 				(int arg, int local)
 * 	- 권고 : 로컬변수를 람다식에서 사용하게 되면 변수에 명시적으로 final을 기술하여
 * 			 값을 수정할 수 없다는 것을 명시
 */
public class UsingLocalVariable {
	void method(final int arg) {//arg는 final 특성을 가짐
		final int local = 40; //localVar 는 final 특성을 가짐
		int local2 = 50;
			
		//local는 람다식에서 참조하므로 변경이 블가능(final 특성을 갖음)
		//arg += local;
		//local += local2;
		
		//람다식
		MyFunctionalInterface fi = () ->{
			//로컬 변수 읽기
			System.out.println("arg : "+arg);
			System.out.println("local : "+local + "\n");
		};
		fi.method();
		//local2는 람다식에서 참조하지 않았으므로 변경이 가능(final 특성을 갖지 않음)
		local2 += local;
		System.out.println("local2 : "+local2);
	}
}
