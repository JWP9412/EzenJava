package threadsyncronized;

public class Calc {

	private int memory;
	
	public int getMemory() {
		return this.memory;
	}
	
	public void setMemory(int memory) {	//���� �޸𸮿� ���� �����ϴ� �޼ҵ�
		System.out.println("setMemory > "+Thread.currentThread().getName() + " : " + this.memory);
		
		this.memory = memory;			// �Ű����� memory �ʵ忡 ����
		
		try {								// <--
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) {}	// <-- �����带 2�ʰ� �Ͻ� ������Ŵ
		
		System.out.println("setMemory < "+Thread.currentThread().getName() + " : " + this.memory);
	}
	
}
