package throwsException;
/*
 * ���� ���ѱ��(throws)
 * ���ܸ� �޼ҵ带 ȣ���� ������ ����
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
			System.out.println("Ŭ������ �������� �ʽ��ϴ�");
		}
	}

}
