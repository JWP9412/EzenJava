package lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		ArrayList<String> listLangs = new ArrayList<String>();  

		listLangs.add("1.Java");
		listLangs.add("2.JavaScript");
		listLangs.add("3.Python");
		
		System.out.println("<ArrayList>");
		for(String a : listLangs) {
			System.out.println(a);
		}
	}

}
