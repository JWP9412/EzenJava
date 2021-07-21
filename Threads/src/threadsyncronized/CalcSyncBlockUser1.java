package threadsyncronized;

public class CalcSyncBlockUser1 extends Thread{
	private CalcSync calc;
	
	public void setCalc(CalcSync calc) {
		this.setName("CalcUser1");			// 스레드 이름을 User1으로 설정
		this.calc = calc;	// 공유 객체인 Calculator를 필드에 저장
	}
	
	public void run() {
		calc.setMemoryBlock(100);		// 공유 객체인 Calculator의 메모리를 100으로 저장
		System.out.println("run >" + getName() + ":" + calc.getMemory());
	}
}
