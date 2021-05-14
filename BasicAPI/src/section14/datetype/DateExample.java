package section14.datetype;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		//String strNow1 = now.toString();
		//System.out.println("Now1 : " + strNow1);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow2 = sdf1.format(now);
		System.out.println("Now2 : " + strNow2);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy년 MM월 dd일 a HH : mm : ss E요일");
		String strNow3 = sdf2.format(now);
		System.out.println("Now3 : " + strNow3);

	}

}
