package threadsyncronized;

public class CalcSyncBlockUserRun {

	public static void main(String[] args) {
		CalcSync cal = new CalcSync();
		
		CalcSyncBlockUser1 user1 = new CalcSyncBlockUser1(); 	// User1 ������ ����
		user1.setCalc(cal);							// ���� ��ü ����
		user1.start();								// User1 ������ ����

		CalcSyncBlockUser2 user2 = new CalcSyncBlockUser2();	// User2 ������ ����
		user2.setCalc(cal);							// ���� ��ü ����
		user2.start();								// User2 ������ ����
	}

}
