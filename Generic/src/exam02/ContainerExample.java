package exam02;

public class ContainerExample {

	public static void main(String[] args) {
		Container<String> c1 = new Container<String>();
		c1.set("kim");
		String str = c1.get();
		System.out.println(str);
		
		Container<Integer> c2 = new Container<Integer>();
		c2.set(6);
		int val = c2.get();
		System.out.println(val);
	}

}
