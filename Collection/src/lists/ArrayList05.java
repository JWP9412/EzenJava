package lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList05 {

	public static void main(String[] args) {
		ArrayList<String> listLangs = new ArrayList<String>();  

		listLangs.add("1.Java");
		listLangs.add("2.자바스크립트");
		listLangs.add("3.Python");
				
		
		for(int cnt=0; cnt<listLangs.size();cnt++) {
			String lang = listLangs.get(cnt);
			System.out.printf("cnt[%d] [%s]\n", cnt, lang);

		}
		// 해당하는 객체가 존재하는지 검사
		boolean js = listLangs.contains("2.자바스크립트");
		System.out.println("'2.자바스크립트'가 존재합니까 : "+ js);
		
		// 해당하는 객체가 존재하는지 검사
				boolean py = listLangs.contains("python");
				System.out.println("'python'이 존재합니까 : "+ py);
	}

}
