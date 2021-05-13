package section03;

import java.util.HashMap;

public class KeyExample2 {

	public static void main(String[] args) {
		HashMap<Key, String> hashMap = new HashMap<Key,String>();
		
		Key hKey = new Key(100,32);
		hashMap.put(hKey, "ȫ�浿");
		
		String value = hashMap.get(hKey);
		System.out.println(value);

	}

}
