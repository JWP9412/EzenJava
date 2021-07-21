package threadstatecontrols.stops;

public class StopFlagThreadRun {
	public static void main(String[] args) {
		StopFlagThread pt = new StopFlagThread();
		pt.start();
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		pt.setStop(true);
	}
}
