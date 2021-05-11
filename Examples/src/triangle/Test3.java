package triangle;

public class Test3 {

	public static void main(String[] args) {
		String arr[] = new String[5];
		String star = "* ";
		String space = " ";
		for(int i=0;i<5;i++) {
			arr[i] =space.repeat(5-i)+star.repeat(i+1);
			System.out.println(arr[i]);
		}

	}

}
