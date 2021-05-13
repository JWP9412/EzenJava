package section03.finalize;

public class FinalizeExample {
	public static void main(String[] args) {
		Counter counter = null;
		for(int i = 1;i<=50;i++) {
			//System.out.println("Counter:no : "+i);
			counter = new Counter(i);
			counter = null;
			System.gc();//Garbage Collector
		}
	}
}
