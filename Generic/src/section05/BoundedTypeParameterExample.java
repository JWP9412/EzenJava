package section05;

public class BoundedTypeParameterExample {

	public static void main(String[] args) {
		//String str = Util.compare("a","b");
		//int re = Util.compare("3.14", "3");
		//int re = Util.compare(3.14f, 'A');
		int result1 = Util.compare(10, 20);
		System.out.println(result1);
		
		int result2 = Util.compare(4.5, 3);
		System.out.println(result2);
		
		//Char -> Integer
		int r = Util.compare(3.14f, new Integer('A'));
		System.out.println(r);
		
		boolean bl = Util.compare("hi", "hi");
		System.out.println("bl : "+bl);

	}

}
