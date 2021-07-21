package threadstatecontrols.stops;

public class InterruptThread extends Thread {
	public void run() {
		try {
			while(true) {
				System.out.println("실행 중 : " + Thread.interrupted());
				Thread.sleep(500);
				if(Thread.interrupted()) {
					break;
				}
			}
		} catch (InterruptedException e) {
			System.out.println("InterruptedException..");
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
