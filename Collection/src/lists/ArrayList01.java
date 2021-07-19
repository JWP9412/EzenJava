package lists;
/* ArrayList() 초기 용량 : private static final int DEFAULT_CAPACITY = 10;
 */
import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		List<String> listLangs = new ArrayList<String>();  

		listLangs.add("1.Java");
		listLangs.add("2.JavaScript");
		listLangs.add("3.Python");
		
		for(String a : listLangs) {
			System.out.println(a);
		}
	}

}
