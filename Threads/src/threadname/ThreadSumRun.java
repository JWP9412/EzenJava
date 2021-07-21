package threadname;

public class ThreadSumRun {

	public static void main(String[] args) {
		ThreadSum sum1 = new ThreadSum("sum1", 1000000);
		ThreadSum sum2 = new ThreadSum("sum2", 100000);

		sum1.start();
		sum2.start();
		
//		System.out.printf("* Thread : [%s], sum: [%d]\n", sum1.getName(), sum1.sum());
//		System.out.printf("* Thread : [%s], sum: [%d]\n", sum2.getName(), sum2.sum());
		
	}

}
