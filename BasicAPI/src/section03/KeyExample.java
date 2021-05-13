package section03;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		//Key ��ü�� �ĺ�Ű�� ����ؼ� String ���� �����ϴ� HashMap ��ü ����
		HashMap<Key, String> hashMap = new HashMap<Key,String>();
		
		//�ĺ�Ű "new Key(100)"�� "ȫ�浿"�� ������
		hashMap.put(new Key(100, 32), "ȫ�浿");
		hashMap.put(new Key(200, 33), "�̼���");
		hashMap.put(new Key(200, 33), "����ġ");// �̼����� ���� ����
		
		//�ĺ�Ű "new Key(100)"�� "ȫ�浿"�� �ҷ���
		String value = hashMap.get(new Key(100, 32));
		System.out.println(value);
		
		String value2 = hashMap.get(new Key(200, 33));
		System.out.println(value2);

	}

}
