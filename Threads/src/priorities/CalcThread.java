package priorities;

public class CalcThread extends Thread {
	double tot;
	
	public CalcThread(String tname) {
		setName(tname);
	}
	
	public void run() {
		for(int i=1; i<= 2000000000; i++) {
			tot += (double)i;
		}
		System.out.printf("Thread : [%s], tot : [%.0f]\n",getName(),tot);
	}
}
