package threadsyncronized;

public class CalcSyncUserRun {

	public static void main(String[] args) {
		CalcSync cal = new CalcSync();
		
		CalcSyncUser1 user1 = new CalcSyncUser1(); 	// User1 스레드 생성
		user1.setCalc(cal);							// 공유 객체 생성
		user1.start();								// User1 스레드 시작

		CalcSyncUser2 user2 = new CalcSyncUser2();	// User2 스레드 생성
		user2.setCalc(cal);							// 공유 객체 생성
		user2.start();								// User2 스레드 시작
	}

}
