package lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList04 {

	public static void main(String[] args) {
		ArrayList<String> listLangs = new ArrayList<String>();  

		listLangs.add("1.Java");
		listLangs.add("2.�ڹٽ�ũ��Ʈ");
		listLangs.add("3.Python");
		
		for(int cnt=0; cnt<listLangs.size();cnt++) {
			String lang = listLangs.get(cnt);
			System.out.printf("cnt[%d] [%s]\n", cnt, lang);
//			System.out.println(listLangs.get(cnt));
		}
		
		// ����� ��ü�� �ٲ� : �ε��� 1��°�� �ִ� ������ �ٲ�
		listLangs.set(1, "2.JavaScript");
		
		// ����� ��ü�� ���� : �ε��� 2��°�� �ִ� ��ü�� ����
		listLangs.remove(2);
		
		// ����� ��ü�� ���� : ����Ʈ���� �ش��ϴ� ��ü�� ã�� ����	
		listLangs.remove("1.Java");
		
		
		System.out.println("<ArrayList>");
		System.out.println("size : "+ listLangs.size());
		for(int cnt=0; cnt<listLangs.size();cnt++) {
			String lang = listLangs.get(cnt);
			System.out.printf("cnt[%d] [%s]\n", cnt, lang);
//			System.out.println(listLangs.get(cnt));
		}
		
		
		System.out.println("<����Ʈ�� ��� ������ ����>");
		listLangs.clear();
		System.out.println("size : "+ listLangs.size());
		for(int cnt=0; cnt<listLangs.size();cnt++) {
			String lang = listLangs.get(cnt);
			System.out.printf("cnt[%d] [%s]\n", cnt, lang);
//			System.out.println(listLangs.get(cnt));
		}
	}

}
