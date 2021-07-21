package threadsyncronized;

public class CalcSyncBlockUser1 extends Thread{
	private CalcSync calc;
	
	public void setCalc(CalcSync calc) {
		this.setName("CalcUser1");			// ������ �̸��� User1���� ����
		this.calc = calc;	// ���� ��ü�� Calculator�� �ʵ忡 ����
	}
	
	public void run() {
		calc.setMemoryBlock(100);		// ���� ��ü�� Calculator�� �޸𸮸� 100���� ����
		System.out.println("run >" + getName() + ":" + calc.getMemory());
	}
}
