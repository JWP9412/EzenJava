package threadstatecontrols.notifyies;
/*
 * notify : �Ͻ����� ���¿� �ִ� �����带 ���� ��� ���·� ����
 * wait : �ڽ��� ���۽�Ų �����带 �Ͻ� ���� ���·� ����
 */

public class WorkObject {
	
	public synchronized void methodA() {
		System.out.println("ThreadA �� methodA() �۾� ����");
		
		notify();				// �Ͻ� ���� ���¿� �ִ� ThreadB�� ���� ��� ���·� ����
		
		try {
			wait();				// ThreadA�� �Ͻ� ���� ���·� ����
		} catch (Exception e) {
		}
	}

	public synchronized void methodB() {
		System.out.println("ThreadB �� methodB() �۾� ����");
		notify();				// �Ͻ� ���� ���¿� �ִ� ThreadA�� ���� ��� ���·� ����
		
		try {
			wait();				// ThreadB�� �Ͻ� ���� ���·� ����
		} catch (Exception e) {
		}

	}
}
