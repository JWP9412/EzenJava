package threadsyncronized;

public class CalcSyncUser2 extends Thread{
	private CalcSync calc;
	
	public void setCalc(CalcSync calc) {
		this.setName("CalcUser2");			// ������ �̸��� User1���� ����
		this.calc = calc;	// ���� ��ü�� Calculator�� �ʵ忡 ����
	}
	
	public void run() {
		calc.setMemory(200);		// ���� ��ü�� Calculator�� �޸𸮸� 100���� ����
		System.out.println("run >" + getName() + ":" + calc.getMemory());
	}
}
