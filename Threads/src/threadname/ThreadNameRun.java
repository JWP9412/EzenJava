package threadname;
/*
 * Thread.setName(), Thread.getName()�� ����Ͽ� �����带 �ĺ�
 */
public class ThreadNameRun {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("���ν����� : " + mainThread);
		
		ThreadT1 t1 = new ThreadT1();
		System.out.println("�۾� ������ : " + t1.getName());
		
		ThreadT2 t2 = new ThreadT2();
		System.out.println("�۾� ������ : " + t2.getName());
		
		t1.start();
		t2.start();

		System.out.println("THE END");
	}

}
