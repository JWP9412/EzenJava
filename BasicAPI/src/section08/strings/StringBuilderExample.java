package section08.strings;
/*
 * ��Ʈ�� ���� ó��
 * -StringBuffer : ��Ƽ ������ ȯ�濡�� ����� �� �ֵ��� ����ȭ�� ����� Ŭ����
 * -StringBuilder : ���� ������ ȯ�濡�� ����� �� �ִ� Ŭ����
 * -String : ����� ���ڿ��� ������ �� ����
 * 
 */
public class StringBuilderExample {

	public static void main(String[] args) {
		//testString();
		//addString();
		stringBuilder();
		
	}
	
	static void stringBuilder() {
		StringBuilder sb = new StringBuilder(); // StringBuilder ��ü ����
		
		sb.append("Java "); //���ڿ� ���� �߰�
		sb.append("Program Study");
		System.out.println(sb.toString());

		sb.insert(4, "8");	//4��° ���ڵڿ� 8�� ����
		System.out.println(sb.toString());

		sb.setCharAt(4, '7'); //4��° ���� ���� ���ڸ� 7�� ����
		System.out.println(sb.toString());

		sb.replace(6, 13, "Book"); //6��° ���� �ں��� 13��° ���ڱ����� "Book"���ڿ��� ��ġ
		System.out.println(sb.toString());

		sb.delete(4, 5); // 5��° ���ڸ� ����
		System.out.println(sb.toString());

		int length = sb.length(); // �� ���� �� ���
		System.out.println("Length : "+length);
		
		String result = sb.toString(); // ���ۿ� �ִ� ���� String Ÿ������ ����
		System.out.println(result);
		
		int pos = sb.indexOf("Study");
		System.out.println(pos);
		
		int pox = sb.indexOf("Boox");
		System.out.println("Book pox : " +pox);
	}
	
	static void testString() {
		String str = "hello �ȳ� ģ���� ������ ��������";
		System.out.println(str);
		/*
		 * String�� ���ڿ��� ������ �� ����.
		 */
		//str[0] = 'x';
		//char ch =str[0];
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			System.out.printf("str[%d]=%c\n",i,ch);
		}
		
	}
	static void addString() {
		String str = null;
		str = "hello";
		str += ",hi\n";
		str += "�ȳ�";
		str += "!";
		System.out.println("addString : " + str);
	}
}
