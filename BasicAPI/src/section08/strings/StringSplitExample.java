package section08.strings;

public class StringSplitExample {

	public static void main(String[] args) {
		String text = "홍길동&이수홍,박연수,김자바-최명호";

		String[] names = text.split("&|,|-");

		System.out.println("names.length = : " +names.length);
		for (String name : names) {
			System.out.println(name);
		}
	}
}
