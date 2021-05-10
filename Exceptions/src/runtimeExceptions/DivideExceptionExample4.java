package runtimeExceptions;

public class DivideExceptionExample4 {

	public static void main(String[] args) {
		int x = 10;
		int y = 2;
		int z = 0;

		try {
			z = x / y;
			System.out.println("z = " + z);

		} catch (ArithmeticException e) {// throw new ArithmeticException();
			System.out.println("x의 값을 0으로 나누려고 했습니다");
		}
		System.out.println("z = " + z);
	}

}
