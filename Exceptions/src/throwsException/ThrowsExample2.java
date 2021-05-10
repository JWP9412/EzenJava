package throwsException;
/*
 * 예외 떠너기기(throws)
 * 예외를 메소드를 호출한 곳으로 지정
 */
public class ThrowsExample2 {

	public static void main(String[] args) {
			findClass();
	}
	
	public static void findClass() {
		try {
		//Class clazz = Class.forName("java.lang.String2");
		Class clazz = Class.forName("java.lang.String");
		if(clazz != null) {
			System.out.println("Class found...");
		}
		}catch(ClassNotFoundException e){
			System.out.println("클래스가 존재하지 않습니다");
		}
	}

}
