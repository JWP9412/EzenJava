package threadstatecontrols.joins;

public class CalcThread extends Thread {
	double tot;
	
	public CalcThread(String tname) {
		setName(tname);
	}
	
	public void run() {
		for(int i=0; i<1000; i++) {
			tot += (double)i;
		}
		
	}
	public double total() {
		return this.tot;
	}
}
