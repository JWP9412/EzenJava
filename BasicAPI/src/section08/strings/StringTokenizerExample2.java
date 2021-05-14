package section08.strings;

import java.util.StringTokenizer;

public class StringTokenizerExample2 {

	public static void main(String[] args) {
		String text = "홍길동|이수홍/박연수&김깝십%대포폰";
		
		//how1 : 전체 토큰 수를 얻어 for문으로 루핑
		StringTokenizer st = new StringTokenizer(text, "|/&%");
		int countTokens = st.countTokens();
		System.out.println("countTokens : " +countTokens);
		/*for(int i=0;i<countTokens;i++) {
			String token = st.nextToken();
			System.out.printf("[%d] = %s\n",i,token);
		}
		System.out.println();
		System.out.println("countTokens : " +countTokens);*/
		//how2 : 남아 있는 토큰을 확인하고 while문으로 루핑
		st = new StringTokenizer(text, "|/&%");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
