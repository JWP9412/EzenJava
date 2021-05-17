package section04;

public class BoxingMethodExample {

	public static void main(String[] args) {
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int val = box1.get();
		System.out.println("val = "+val);
		
		Box<String> box2 = Util.boxing("kim");
		String strValue = box2.get();
				

	}

}
