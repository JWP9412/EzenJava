package threadsyncronized;

public class CalcSyncBlockUser2 extends Thread{
	private CalcSync calc;
	
	public void setCalc(CalcSync calc) {
		this.setName("CalcUser2");			// ������ �̸��� User1���� ����
		this.calc = calc;	// ���� ��ü�� Calculator�� �ʵ忡 ����
	}
	
	public void run() {
		calc.setMemoryBlock(200);		// ���� ��ü�� Calculator�� �޸𸮸� 100���� ����
		System.out.println("run >" + getName() + ":" + calc.getMemory());
	}
}
