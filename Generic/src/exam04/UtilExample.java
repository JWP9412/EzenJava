package exam04;

public class UtilExample {

	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("son", 35);
		Integer age = Util.getValue(pair, "son");
		System.out.println(age);
		
		ChildPair<String, Integer> childPair = new ChildPair<>("hong",20);
		Integer childAge = Util.getValue(childPair, "ong");
		System.out.println(childAge);
		
		/*
		OtherPair<String, Integer> otherPair = new OtherPair<>("hong", 20);
		int otherAge = Util.getValue(otherPair, "hong");
		System.out.println(otherAge);
		*/
	}

}
