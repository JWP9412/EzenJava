package section04;

public class UsingThisExample {

	public static void main(String... args) {
		UsingThis usingThis = new UsingThis();
		usingThis.add(50);
		
		UsingThis.Inner inner = usingThis.new Inner();
		inner.method();
		
		usingThis.add(40);
		inner.method();

	}

}
