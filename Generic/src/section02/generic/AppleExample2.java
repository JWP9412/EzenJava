package section02.generic;

public class AppleExample2 {

	public static void main(String[] args) {
		Apple apple = new Apple();
		apple.set(100);
		
		Integer val = (int)apple.get();
		System.out.println(val);
		

	}

}
