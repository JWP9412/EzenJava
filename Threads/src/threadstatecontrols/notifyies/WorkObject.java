package threadstatecontrols.notifyies;
/*
 * notify : 일시정지 상태에 있는 스레드를 실행 대기 상태로 변경
 * wait : 자신을 싱핼시킨 스레드를 일시 정지 상태로 변경
 */

public class WorkObject {
	
	public synchronized void methodA() {
		System.out.println("ThreadA 의 methodA() 작업 실행");
		
		notify();				// 일시 정지 상태에 있는 ThreadB를 실행 대기 상태로 만듬
		
		try {
			wait();				// ThreadA를 일시 정지 상태로 만듬
		} catch (Exception e) {
		}
	}

	public synchronized void methodB() {
		System.out.println("ThreadB 의 methodB() 작업 실행");
		notify();				// 일시 정지 상태에 있는 ThreadA를 실행 대기 상태로 만듬
		
		try {
			wait();				// ThreadB를 일시 정지 상태로 만듬
		} catch (Exception e) {
		}

	}
}
