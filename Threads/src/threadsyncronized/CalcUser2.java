package threadsyncronized;

public class CalcUser2 extends Thread{
	private Calc calc;
	
	public void setCalc(Calc calc) {
		this.setName("CalcUser2");			// ������ �̸��� User1���� ����
		this.calc = calc;	// ���� ��ü�� Calculator�� �ʵ忡 ����
	}
	
	public void run() {
		calc.setMemory(200);		// ���� ��ü�� Calculator�� �޸𸮸� 100���� ����
		System.out.println("run >" + getName() + ":" + calc.getMemory());
	}
}
