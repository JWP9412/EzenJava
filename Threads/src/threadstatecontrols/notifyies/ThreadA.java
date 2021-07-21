package threadstatecontrols.notifyies;

public class ThreadA extends Thread {
	private WorkObject workobj;
	
	public ThreadA(WorkObject workobj) {
		this.workobj =workobj;// 공유 객체를 매개값으로 받아 필드에 저장
	}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {// 공유 객체의 methodB() 를 10번 반복 호출
			workobj.methodA();
		}
	}
	public void run2() {
		for(int k=1; k<10;k++) {
			System.out.println(k);
		}
	}
}
