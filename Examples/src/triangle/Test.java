package triangle;

public class Test {
	public static void main(String[] args) {
		String a = "* ";
		String b = " ";
		int x = 5;
		for (int i = 1; i <= 5; i++) {
			System.out.print(b.repeat(5 - i));
			System.out.println(a.repeat(i));
		}
	}
}
