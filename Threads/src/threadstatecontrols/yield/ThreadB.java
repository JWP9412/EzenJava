package threadstatecontrols.yield;

public class ThreadB extends Thread{
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) { // stop이 true가 되면 while문 종료
			if(work) {
				System.out.println("ThreadB runs");
			}else {
				System.out.println("ThreadB yield");
				Thread.yield(); // work가 false가 되면 다른 스레드에게 실행 양보
			}
		}
		System.out.println("ThreadB ends!!!");
	}
}
