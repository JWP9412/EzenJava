package section08.strings;
/*
 * 스트링 생성 처리
 * -StringBuffer : 멀티 스레드 환경에서 사용할 수 있도록 동기화가 적용된 클래스
 * -StringBuilder : 단일 스레드 환경에서 사용할 수 있는 클래스
 * -String : 저장된 문자열을 수정할 수 없다
 * 
 */
public class StringBuilderExample {

	public static void main(String[] args) {
		//testString();
		//addString();
		stringBuilder();
		
	}
	
	static void stringBuilder() {
		StringBuilder sb = new StringBuilder(); // StringBuilder 객체 생성
		
		sb.append("Java "); //문자열 끝에 추가
		sb.append("Program Study");
		System.out.println(sb.toString());

		sb.insert(4, "8");	//4번째 문자뒤에 8를 삽입
		System.out.println(sb.toString());

		sb.setCharAt(4, '7'); //4번째 문자 뒤의 문자를 7로 변경
		System.out.println(sb.toString());

		sb.replace(6, 13, "Book"); //6번째 문자 뒤부터 13번째 문자까지를 "Book"문자열로 대치
		System.out.println(sb.toString());

		sb.delete(4, 5); // 5번째 문자를 삭제
		System.out.println(sb.toString());

		int length = sb.length(); // 총 문자 수 얻기
		System.out.println("Length : "+length);
		
		String result = sb.toString(); // 버퍼에 있는 것을 String 타입으로 리턴
		System.out.println(result);
		
		int pos = sb.indexOf("Study");
		System.out.println(pos);
		
		int pox = sb.indexOf("Boox");
		System.out.println("Book pox : " +pox);
	}
	
	static void testString() {
		String str = "hello 안녕 친구들 빡빡이 아저씨야";
		System.out.println(str);
		/*
		 * String은 문자열을 수정할 수 없다.
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
		str += "안녕";
		str += "!";
		System.out.println("addString : " + str);
	}
}
