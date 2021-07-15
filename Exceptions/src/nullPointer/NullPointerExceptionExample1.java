package nullPointer;

public class NullPointerExceptionExample1 {

	public static void main(String[] args) {
		String data = null;
		System.out.printf("data.length=[%d]\n",data.length());
		System.out.printf("data.toString[%s]\n",data.toString()); //java.lang.NullPointerException
		
		
		System.out.println("ÀÛ¾÷ ³¡");
	}

}
