/*
 * 사용자 정의 예외 클래스
 * Exception을 상속하게 되면 실행 예외처리를 위한 클래스 예외 클래스
 */
package userexception;

public class UserRuntimeException extends RuntimeException {
	public UserRuntimeException() {}

	public UserRuntimeException(String message) {
		super(message)	;
	}
}
