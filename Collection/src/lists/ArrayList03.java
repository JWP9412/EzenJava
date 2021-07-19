package lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {

	public static void main(String[] args) {
		ArrayList<String> listLangs = new ArrayList<String>();  

		listLangs.add("1.Java");
		listLangs.add("2.JavaScript");
		listLangs.add("3.Python");
		
		System.out.println("<ArrayList>");
		System.out.println("size : "+ listLangs.size());
		for(int cnt=0; cnt<listLangs.size();cnt++) {
			String lang = listLangs.get(cnt);
			System.out.printf("cnt[%d] [%s]\n", cnt, lang);
//			System.out.println(listLangs.get(cnt));
		}
	}

}
