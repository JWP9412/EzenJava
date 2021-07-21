package threadsyncronized;

public class CalcUser2 extends Thread{
	private Calc calc;
	
	public void setCalc(Calc calc) {
		this.setName("CalcUser2");			// 스레드 이름을 User1으로 설정
		this.calc = calc;	// 공유 객체인 Calculator를 필드에 저장
	}
	
	public void run() {
		calc.setMemory(200);		// 공유 객체인 Calculator의 메모리를 100으로 저장
		System.out.println("run >" + getName() + ":" + calc.getMemory());
	}
}
