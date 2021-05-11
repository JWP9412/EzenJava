package triangle;

public class Test2 {
	public static void main(String[] args) {
		String a = "* ";
		String b = " ";
		int x = 5;
		for (int i = 1; i <= 5; i++) {
			System.out.print(b.repeat(5 - i));
			System.out.println(a.repeat(i));
		}
		for(int k=4; k>=1; k--) {
			System.out.print(b.repeat(5 - k));
			System.out.println(a.repeat(k));
		}
	}
}
