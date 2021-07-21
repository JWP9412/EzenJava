package threadstatecontrols.stops;

public class InterruptThread extends Thread {
	public void run() {
		try {
			while(true) {
				System.out.println("���� �� : " + Thread.interrupted());
				Thread.sleep(500);
				if(Thread.interrupted()) {
					break;
				}
			}
		} catch (InterruptedException e) {
			System.out.println("InterruptedException..");
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
