package section10.regexpr;

import java.util.regex.Pattern;
//정상적인 자료인지 확인할시에 많이 쓰인다
public class PatternExample {

	public static void main(String[] args) {
		// simpleRegExpr();
		multipleRegExpr();
	}

	static void multipleRegExpr() {
		String regExp = "(02|010|031)-\\d{3,4}-\\d{4}";
		String[] datum = { 
				"02-123-4567", 
				"02-1234-5432", 
				"02-1234-54320", 
				"010-1234-4567",
				"031-789-1239",
				"032-123-1239",
				"031-12-1239",
				"010-123-123", 
				};
		
		for (int cnt = 0; cnt < datum.length; cnt++) {
			String data = datum[cnt];
			boolean result = Pattern.matches(regExp, data);
			if (result) {
				System.out.println("[1]정규식과 일치합니다[O] : " + data);
			} else {
				System.out.println("[1]정규식과 일치하지 않습니다[X] : " + data);
			}
/*
			regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
			data = "angel@navercom";
			result = Pattern.matches(regExp, data);
			if (result) {
				System.out.println("[2]정규식과 일치합니다 " + data);
			} else {
				System.out.println("[2]정규식과 일치하지 않습니다 " + data);
			}
			*/
		}
	}

	static void simpleRegExpr() {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		// String data = "010-123-4567";
		String data = "02-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("[1]정규식과 일치합니다 " + data);
		} else {
			System.out.println("[1]정규식과 일치하지 않습니다 " + data);
		}

		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@navercom";
		result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("[2]정규식과 일치합니다 " + data);
		} else {
			System.out.println("[2]정규식과 일치하지 않습니다 " + data);
		}

	}

}
