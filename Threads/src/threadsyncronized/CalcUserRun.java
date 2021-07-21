package threadsyncronized;

public class CalcUserRun {

	public static void main(String[] args) {
		Calc cal = new Calc();
		
		CalcUser1 user1 = new CalcUser1(); 	// User1 스레드 생성
		user1.setCalc(cal);					// 공유 객체 생성
		user1.start();						// User1 스레드 시작

		CalcUser2 user2 = new CalcUser2();	// User2 스레드 생성
		user2.setCalc(cal);					// 공유 객체 생성
		user2.start();						// User2 스레드 시작
	}

}
