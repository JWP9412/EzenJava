package section04;

public class CompareMethodExample2 {

	public static void main(String[] args) {

		Pair<String, String> p3 = new Pair<>("user1", "Kim");
		Pair<String, String> p4 = new Pair<>("user2", "Kim");
		boolean result2 = Util.compare(p3, p4);
		if (result2) {
			System.out.println("equals");
		} else {
			System.out.println("difference");
		}

	}

}
