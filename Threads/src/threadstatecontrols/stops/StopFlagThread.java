package threadstatecontrols.stops;

public class StopFlagThread extends Thread {
	private boolean stop = false;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	public void run() {
		while(!stop) {
			System.out.println("���� ��");
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
	

}
