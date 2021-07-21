package threadstatecontrols.stops;

public class StopFlagThread extends Thread {
	private boolean stop = false;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	public void run() {
		while(!stop) {
			System.out.println("실행 중");
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
	

}
