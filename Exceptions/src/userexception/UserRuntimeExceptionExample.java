/*
 * 사용자 정의 예외 클래스
 * Exception을 상속하게 되면 일반적인 예외처리를 위한 클래스 예외 클래스
 */
package userexception;

public class UserRuntimeExceptionExample extends Exception {
	public static void main(String[] args) {
		try {
			//runtime("시스템 정보");
			runtime(null);
		}catch(UserRuntimeException e) {
			System.out.println("main : " + e.getMessage());
		}
	}
	//static void runtime(String msg) {
	static void runtime(String msg) throws UserRuntimeException {
	
		if (msg == null) {
			throw new UserRuntimeException("시스템 정보가 없습니다");
		}
		System.out.println("runtime : " + msg);
	}
}
