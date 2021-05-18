package section08.strings;

public class StringSplitExample2 {

	public static void main(String[] args) {
		String text = "010=1234-4567";

		String[] tels = text.split("-|,|/|=");

		System.out.println("names.length = : " +tels.length);
		for (String tel : tels) {
			System.out.println(tel);
		}
		for(int i=0; i<tels.length;i++) {
			String name = tels[i];
			System.out.printf("tels[%d] = %s \n",i,name);
		}
	}
}
