package beep;

import java.awt.Toolkit;

public class BeepTask implements Runnable {

	@Override
	public void run() {
		System.out.println(">BeepTask : start!!!");
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // 툴킷 객체 얻기
		for (int i = 0; i < 5; i++) {
			System.out.printf("beep (%d)!!!\n ",i+1);
			toolkit.beep(); // 비프음 발생
			try {
				Thread.sleep(500); // millisecond(1000분의 1초) 0.5초간 일시 정지
			} catch (Exception e) {
			} 
			System.out.println(">BeepTask : finished!!");
		}

	}
}
