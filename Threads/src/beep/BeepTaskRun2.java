/*
 * Runnable 인터페이스의 익명 구현 객체를 생성하여
 * Thread의 생성자로 전달하여 스레드를 처리
 */
package beep;

import java.awt.Toolkit;

public class BeepTaskRun2 {

	public static void main(String[] args) {

		// 스레드 객체 생성
		Thread beepThread = new Thread(new Runnable() { // 익명 구현 객체

			@Override
			public void run() {

				System.out.println(">BeepTask : BeepTaskRun2 start!!!");
				Toolkit toolkit = Toolkit.getDefaultToolkit(); // 툴킷 객체 얻기
				for (int i = 0; i < 5; i++) {
					System.out.printf("beep (%d)!!!\n ", i + 1);
					toolkit.beep(); // 비프음 발생
					try {
						Thread.sleep(250); // millisecond(1000분의 1초) 0.5초간 일시 정지
					} catch (Exception e) {
					}
					System.out.println("BeepTask : end loop");

				}
				System.out.println(">BeepTask : finished!!");

			}

		});

		// 스레드 시작(백그라운드로 처리)
		beepThread.start();

		// 스레드가 종료 되기 전에 먼저 메인 스레드가 종료
		System.out.println("main thread end");
		System.out.println("THE END");
	}

}
