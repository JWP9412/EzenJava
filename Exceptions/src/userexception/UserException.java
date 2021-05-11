/*
 * 사용자 정의 예외 클래스
 * Exception을 상속하게 되면 일반적인 예외처리를 위한 클래스 예외 클래스
 */
package userexception;

public class UserException extends Exception {
	public UserException() {}

	public UserException(String message) {
		super(message)	;
	}
}
