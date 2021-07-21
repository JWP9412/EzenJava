package threadsyncronized;

public class CalcSyncBlockUserRun {

	public static void main(String[] args) {
		CalcSync cal = new CalcSync();
		
		CalcSyncBlockUser1 user1 = new CalcSyncBlockUser1(); 	// User1 스레드 생성
		user1.setCalc(cal);							// 공유 객체 생성
		user1.start();								// User1 스레드 시작

		CalcSyncBlockUser2 user2 = new CalcSyncBlockUser2();	// User2 스레드 생성
		user2.setCalc(cal);							// 공유 객체 생성
		user2.start();								// User2 스레드 시작
	}

}
