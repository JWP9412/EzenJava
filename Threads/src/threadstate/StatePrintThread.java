package threadstate;

public class StatePrintThread extends Thread {
	private Thread targetThread;
	
	public StatePrintThread() { // Thread targetThread : 상태를 조사할 스레드
		this.targetThread = new TargetThread();
	}
	
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState();
			System.out.println("타겟 스레드 상태 : "+ state);
			
			if(state == Thread.State.NEW) {
				targetThread.start();
			}
			
			if(state == Thread.State.TERMINATED){
				break;
			}try {
				((TargetThread)targetThread).loopCount();
				//0.5초간 일시 정지
				//Thread.sleep(500);
			}catch (Exception e) {}
		}
	}
}
