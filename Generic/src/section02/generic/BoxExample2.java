package section02.generic;

public class BoxExample2 {
	public static void main(String[] args) {
		//Box<String> box = new Box<String>();
		Box<Integer> box = new Box<Integer>();
		box.set(99);

		Integer i1 = box.get();
		int i2 = box.get();
		System.out.println(i1);
		System.out.println(i2);
	}

}
