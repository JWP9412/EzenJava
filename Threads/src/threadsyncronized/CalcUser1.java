package threadsyncronized;

public class CalcUser1 extends Thread{
	private Calc calc;
	
	public void setCalc(Calc calc) {
		this.setName("CalcUser1");			// ������ �̸��� User1���� ����
		this.calc = calc;	// ���� ��ü�� Calculator�� �ʵ忡 ����
	}
	
	public void run() {
		calc.setMemory(100);		// ���� ��ü�� Calculator�� �޸𸮸� 100���� ����
		System.out.println("run >" + getName() + ":" + calc.getMemory());
	}
}
