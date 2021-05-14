package section10.regexpr;

import java.util.regex.Pattern;
//�������� �ڷ����� Ȯ���ҽÿ� ���� ���δ�
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
				System.out.println("���Խİ� ��ġ�մϴ�[O] : " + data);
			} else {
				System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�[X] : " + data);
			}
/*
			regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
			data = "angel@naver.com";
			result = Pattern.matches(regExp, data);
			if (result) {
				System.out.println("[2]���Խİ� ��ġ�մϴ� " + data);
			} else {
				System.out.println("[2]���Խİ� ��ġ���� �ʽ��ϴ� " + data);
			}
			*/
		}
	}

}
