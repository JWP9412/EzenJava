package section01;

import java.util.List;
import java.util.ArrayList;

public class HelloGeneric3 {

	public static void main(String[] args) {
		genericList();
	}

	static void genericList() { // ���ʸ� Ÿ��
		System.out.println(">>> genericList() <<<");
		
		// ������ �� Ÿ���� ����
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		
		int x1 =list.get(0);
		int x2 =list.get(1);
		
		System.out.println("Integer : " + x1 +", "+x2 );
		
		// �پ��� Ÿ������ ����� �� ����.
		// list.add(100);
	}
}
