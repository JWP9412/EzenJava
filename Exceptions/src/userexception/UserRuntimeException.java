/*
 * ����� ���� ���� Ŭ����
 * Exception�� ����ϰ� �Ǹ� ���� ����ó���� ���� Ŭ���� ���� Ŭ����
 */
package userexception;

public class UserRuntimeException extends RuntimeException {
	public UserRuntimeException() {}

	public UserRuntimeException(String message) {
		super(message)	;
	}
}
