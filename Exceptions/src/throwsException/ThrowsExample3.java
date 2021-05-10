package throwsException;
/*
 * 예외 떠너기기(throws)
 * 예외를 메소드를 호출한 곳으로 지정
 */
public class ThrowsExample3 {

	public static void main(String[] args) throws ClassNotFoundException {
			findClass();
	}
	
	public static void findClass() throws ClassNotFoundException {
		
		Class clazz = Class.forName("java.lang.String2");
		//Class clazz = Class.forName("java.lang.String");
		if(clazz != null) {
			System.out.println("Class found...");
		}
	}
}
