package threadstate;

public class StatePrintThread extends Thread {
	private Thread targetThread;
	
	public StatePrintThread() { // Thread targetThread : ���¸� ������ ������
		this.targetThread = new TargetThread();
	}
	
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState();
			System.out.println("Ÿ�� ������ ���� : "+ state);
			
			if(state == Thread.State.NEW) {
				targetThread.start();
			}
			
			if(state == Thread.State.TERMINATED){
				break;
			}try {
				((TargetThread)targetThread).loopCount();
				//0.5�ʰ� �Ͻ� ����
				//Thread.sleep(500);
			}catch (Exception e) {}
		}
	}
}
