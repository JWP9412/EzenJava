package section01;

import java.util.List;
import java.util.ArrayList;

public class HelloGeneric2 {

	public static void main(String[] args) {
		genericList();
	}

	static void genericList() { // ���ʸ� Ÿ��
		System.out.println(">>> genericList() <<<");
		
		// ������ �� Ÿ���� ����
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		String hello =list.get(0);
		String world =list.get(1);
		System.out.println("String : " + hello +", "+world );
		
		// �پ��� Ÿ������ ����� �� ����.
		// list.add(100);
	}
}
