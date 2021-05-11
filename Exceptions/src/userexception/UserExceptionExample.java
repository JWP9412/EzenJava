/*
 * ����� ���� ���� Ŭ����
 * Exception�� ����ϰ� �Ǹ� �Ϲ����� ����ó���� ���� Ŭ���� ���� Ŭ����
 */
package userexception;

public class UserExceptionExample extends Exception {
	public static void main(String[] args) {
		try {
			user("ȫ�浿");
			//user(null);
		}catch(UserException e) {
			System.out.println("main : " + e.getMessage());
		}
	}

	static void user(String msg) throws UserException {
		if (msg == null) {
			throw new UserException("������� 2��2 �����ϴ�.");
		}
		System.out.println("user : " + msg);
	}
}
