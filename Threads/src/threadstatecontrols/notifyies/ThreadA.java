package threadstatecontrols.notifyies;

public class ThreadA extends Thread {
	private WorkObject workobj;
	
	public ThreadA(WorkObject workobj) {
		this.workobj =workobj;// ���� ��ü�� �Ű������� �޾� �ʵ忡 ����
	}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {// ���� ��ü�� methodB() �� 10�� �ݺ� ȣ��
			workobj.methodA();
		}
	}
	public void run2() {
		for(int k=1; k<10;k++) {
			System.out.println(k);
		}
	}
}
