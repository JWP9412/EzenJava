package section10.regexpr;

import java.util.regex.Pattern;
//정상적인 자료인지 확인할시에 많이 쓰인다
public class PatternExample2 {

	public static void main(String[] args) {
		// simpleRegExpr();
		multipleRegExpr();
	}

	static void multipleRegExpr() {
		String regExp = "\\w+(\\.\\w+)?@\\w+\\.\\w+(\\.\\w+)?";
		String[] datum = { 
				"angel@naver.com",
				"angel.web@naver.com",
				"angel@navercom",
				"angel@naver.co.kr"
				
				};
		
		for (int cnt = 0; cnt < datum.length; cnt++) {
			String data = datum[cnt];
			boolean result = Pattern.matches(regExp, data);
			if (result) {
				System.out.println("정규식과 일치합니다[O] : " + data);
			} else {
				System.out.println("정규식과 일치하지 않습니다[X] : " + data);
			}
/*
			regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
			data = "angel@naver.com";
			result = Pattern.matches(regExp, data);
			if (result) {
				System.out.println("[2]정규식과 일치합니다 " + data);
			} else {
				System.out.println("[2]정규식과 일치하지 않습니다 " + data);
			}
			*/
		}
	}

}
