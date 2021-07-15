/*
 * 사용자 정의 예외 클래스
 * Exception을 상속하게 되면 일반적인 예외처리를 위한 클래스 예외 클래스
 */
package userexception;

public class UserExceptionExample2 extends Exception {
	public static void main(String[] args) {
		try {
//			user("홍길동");
			user(null);
		}catch(UserException e) {
			System.out.println("main : " + e.getMessage());
		}
	}

	static void user(String msg) throws UserException {
		if (msg == null) {
			throw new UserException("사용자의 2름2 없습니다.");
		}
		System.out.println("user : " + msg);
	}
}
