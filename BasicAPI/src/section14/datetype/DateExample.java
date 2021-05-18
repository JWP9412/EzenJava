package section14.datetype;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		//String strNow1 = now.toString();
		//System.out.println("Now1 : " + strNow1);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		String strNow2 = sdf1.format(now);
		System.out.println("Now2 : " + strNow2);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy�� MM�� dd�� a HH : mm : ss E����");
		String strNow3 = sdf2.format(now);
		System.out.println("Now3 : " + strNow3);

	}

}
