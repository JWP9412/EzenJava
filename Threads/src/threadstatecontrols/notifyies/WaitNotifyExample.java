package threadstatecontrols.notifyies;

public class WaitNotifyExample {

	public static void main(String[] args) {
		WorkObject sharedObject = new WorkObject();
		
		ThreadA ta = new ThreadA(sharedObject);
		ThreadB tb = new ThreadB(sharedObject);
		
		ta.start();
		tb.start();

	}

}
