package section08.strings;

import java.util.StringTokenizer;

public class StringTokenizerExample2 {

	public static void main(String[] args) {
		String text = "ȫ�浿|�̼�ȫ/�ڿ���&�����%������";
		
		//how1 : ��ü ��ū ���� ��� for������ ����
		StringTokenizer st = new StringTokenizer(text, "|/&%");
		int countTokens = st.countTokens();
		System.out.println("countTokens : " +countTokens);
		/*for(int i=0;i<countTokens;i++) {
			String token = st.nextToken();
			System.out.printf("[%d] = %s\n",i,token);
		}
		System.out.println();
		System.out.println("countTokens : " +countTokens);*/
		//how2 : ���� �ִ� ��ū�� Ȯ���ϰ� while������ ����
		st = new StringTokenizer(text, "|/&%");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}