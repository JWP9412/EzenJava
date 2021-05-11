/*
 * ����� ���� ���� Ŭ����
 * Exception�� ����ϰ� �Ǹ� �Ϲ����� ����ó���� ���� Ŭ���� ���� Ŭ����
 */
package userexception;

public class UserRuntimeExceptionExample extends Exception {
	public static void main(String[] args) {
		try {
			//runtime("�ý��� ����");
			runtime(null);
		}catch(UserRuntimeException e) {
			System.out.println("main : " + e.getMessage());
		}
	}
	//static void runtime(String msg) {
	static void runtime(String msg) throws UserRuntimeException {
	
		if (msg == null) {
			throw new UserRuntimeException("�ý��� ������ �����ϴ�");
		}
		System.out.println("runtime : " + msg);
	}
}
