package threadsyncronized;

public class CalcSyncUserRun {

	public static void main(String[] args) {
		CalcSync cal = new CalcSync();
		
		CalcSyncUser1 user1 = new CalcSyncUser1(); 	// User1 ������ ����
		user1.setCalc(cal);							// ���� ��ü ����
		user1.start();								// User1 ������ ����

		CalcSyncUser2 user2 = new CalcSyncUser2();	// User2 ������ ����
		user2.setCalc(cal);							// ���� ��ü ����
		user2.start();								// User2 ������ ����
	}

}
