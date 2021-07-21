package priorities;
/*
 * [스레드 우선순위]
 * 디폴트 : NORM_PRIORITY(5)
 * 최댓값 : MAX_PRIORITY(10)
 * 최솟값 : MIN_PRIORITY(1)
 */

public class CalcThreadRun extends Thread {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			Thread thread = new CalcThread("thread "+i);
			
			System.out.printf("[%s] default priority(%d)\n",thread.getName(), thread.getPriority());
			if(i !=10) {
				thread.setPriority(Thread.MIN_PRIORITY);
			}else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			System.out.printf("[%s] priority(%d)\n",thread.getName(), thread.getPriority());
			thread.start();
		}
	}
}
