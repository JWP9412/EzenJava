package numberFormat;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		String s1 = "100";
		String s2 = "a100";
		try {
		int val1 = Integer.parseInt(s1);
		int val2 = Integer.parseInt(s2);
		
		int result = val1 + val2;
		System.out.println(s1 + "+" + s2 + "=" + result);
		}
		catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}
	}

}
