package nullPointer;

public class NullPointerExceptionExample3 {

	public static void main(String[] args) {
		String data = null;

		try {
			System.out.println(data.toString());
		} 
		catch (NullPointerException ex) {
//		catch (ArithmeticException ex) {
			System.out.println("data is null");
			
		}
		System.out.println("The End");
	}
}
