package throwsException;
/*
 * ���� ���ѱ��(throws)
 * ���ܸ� �޼ҵ带 ȣ���� ������ ����
 * main()�� ȣ���� JVM���� ���ܸ� ���ѱ�
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
