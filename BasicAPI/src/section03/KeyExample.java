package section03;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		//Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key,String>();
		
		//식별키 "new Key(100)"로 "홍길동"을 저장함
		hashMap.put(new Key(100, 32), "홍길동");
		hashMap.put(new Key(200, 33), "이순신");
		hashMap.put(new Key(200, 33), "전우치");// 이순신을 덮어 씌움
		
		//식별키 "new Key(100)"로 "홍길동"을 불러옴
		String value = hashMap.get(new Key(100, 32));
		System.out.println(value);
		
		String value2 = hashMap.get(new Key(200, 33));
		System.out.println(value2);

	}

}
