package threadstate;

public class TargetThread extends Thread{
	private int loop;
	
	@Override
	public void run() {
		for(long i = 0; i<10;i++) {
			loopCount();
			try {
				Thread.sleep(500); //0.5�ʰ� �Ͻ�����
			}catch (Exception e) {}
		}
		

		
		
		

//		loopCount();
	}
	
	public synchronized void loopCount() {
		for(long cnt=0; cnt<1000000000 ; cnt++) { //10��
			
		}
		this.loop +=1;
		System.out.println("TargetThread: loop = "+this.loop);
	}
}

	
