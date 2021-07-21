package threadstatecontrols.joins;

public class CalcThreadRun {

	public static void main(String[] args) {
		CalcThread thread = new CalcThread("tot");
		thread.start();
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		System.out.printf("Thread: [%s] tot[%.0f]\n",thread.getName(),thread.total());

	}

}
