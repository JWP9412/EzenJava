package priorities;
/*
 * [������ �켱����]
 * ����Ʈ : NORM_PRIORITY(5)
 * �ִ� : MAX_PRIORITY(10)
 * �ּڰ� : MIN_PRIORITY(1)
 */

public class CalcThreadRun2 extends Thread {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			Thread thread = new CalcThread("thread "+i);
			
//			System.out.printf("[%s] default priority(%d)\n",thread.getName(), thread.getPriority());
			if(i % 2 == 1) {
				thread.setPriority(7);
			}else {
				thread.setPriority(9);
			}
			System.out.printf("[%s] priority(%d)\n",thread.getName(), thread.getPriority());
			thread.start();
		}
	}
}
