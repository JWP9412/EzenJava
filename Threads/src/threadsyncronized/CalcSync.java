/*
 * [����ȭ �޼ҵ�]
 * 	- ������ �޼ҵ带 ����ȭ
 * 	���� �����尡 ������ �ϸ� ���� ó���ϰ� �ִ� �����尡 ó���� ������
 * 	�ٸ� ������� ����Ͽ� ���������� ó���� �� �ֵ��� ��� ó��
 * 
 * [����ȭ ���]
 * 	- ����� ��ü�� ���� ������ ����ȭ
 * 	- ���� �����尡 ������ ��Ͽ� �����ϸ� ������ ��ü�� ����
 * 	  ���� ���� �����带 ó���� ������ �ٸ� ������� ����Ѵ�.
 */
package threadsyncronized;

public class CalcSync {

	private int memory;

	public int getMemory() {
		return this.memory;
	}

	//�޼ҵ� ����ȭ
	public synchronized void setMemory(int memory) { // ���� �޸𸮿� ���� �����ϴ� �޼ҵ�
		System.out.println("CalcSync :: setMemory > " + Thread.currentThread().getName());
		this.memory = memory; // �Ű����� memory �ʵ忡 ����

		try { // <--
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		} // <-- �����带 2�ʰ� �Ͻ� ������Ŵ

		System.out.println("CalcSync :: setMemory < " +Thread.currentThread().getName() + " : " + this.memory);
	}

	//����ȭ ���
	public void setMemoryBlock(int memory) { // ���� �޸𸮿� ���� �����ϴ� �޼ҵ�
		System.out.println("CalcSync :: setMemoryBlock > " + Thread.currentThread().getName());
		synchronized (this) {
			this.memory = memory; // �Ű����� memory �ʵ忡 ����

			try { // <--
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			} // <-- �����带 2�ʰ� �Ͻ� ������Ŵ

			System.out.println("CalcSync :: setMemoryBlock < " + Thread.currentThread().getName() + " : " + this.memory);

		}
	}

}
