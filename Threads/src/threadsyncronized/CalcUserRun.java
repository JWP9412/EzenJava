package threadsyncronized;

public class CalcUserRun {

	public static void main(String[] args) {
		Calc cal = new Calc();
		
		CalcUser1 user1 = new CalcUser1(); 	// User1 ������ ����
		user1.setCalc(cal);					// ���� ��ü ����
		user1.start();						// User1 ������ ����

		CalcUser2 user2 = new CalcUser2();	// User2 ������ ����
		user2.setCalc(cal);					// ���� ��ü ����
		user2.start();						// User2 ������ ����
	}

}
