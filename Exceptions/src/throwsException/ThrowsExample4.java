package throwsException;
/*
 * ���� ���ʱ��(throws)
 * ���ܸ� �޼ҵ带 ȣ���� ������ ����
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
