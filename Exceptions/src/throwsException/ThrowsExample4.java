package throwsException;
/*
 * 예외 떠넘기기(throws)
 * 예외를 메소드를 호출한 곳으로 지정
 */
public class ThrowsExample4 {

	public static void main(String[] args) throws ClassNotFoundException, Exception {
			findClass();
	}
	
	public static void findClass() throws Exception {
		
		Class clazz = Class.forName("java.lang.String2");
		//Class clazz = Class.forName("java.lang.String");
		if(clazz != null) {
			System.out.println("Class found...");
		}
	}
}
