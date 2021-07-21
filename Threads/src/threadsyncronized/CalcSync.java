/*
 * [동기화 메소드]
 * 	- 지정된 메소드를 동기화
 * 	여러 스레드가 접근을 하면 먼저 처리하고 있는 스레드가 처리할 때까지
 * 	다른 스레드는 대기하여 순차적으로 처리할 수 있도록 잠금 처리
 * 
 * [동기화 블록]
 * 	- 저장된 객체에 대한 접근을 동기화
 * 	- 여러 스레드가 지정된 블록에 접근하며 지정된 객체에 대해
 * 	  먼저 들어온 스레드를 처리할 때까지 다른 스레드는 대기한다.
 */
package threadsyncronized;

public class CalcSync {

	private int memory;

	public int getMemory() {
		return this.memory;
	}

	//메소드 동기화
	public synchronized void setMemory(int memory) { // 계산기 메모리에 값을 저장하는 메소드
		System.out.println("CalcSync :: setMemory > " + Thread.currentThread().getName());
		this.memory = memory; // 매개값을 memory 필드에 저장

		try { // <--
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		} // <-- 스레드를 2초간 일시 정지시킴

		System.out.println("CalcSync :: setMemory < " +Thread.currentThread().getName() + " : " + this.memory);
	}

	//동기화 블록
	public void setMemoryBlock(int memory) { // 계산기 메모리에 값을 저장하는 메소드
		System.out.println("CalcSync :: setMemoryBlock > " + Thread.currentThread().getName());
		synchronized (this) {
			this.memory = memory; // 매개값을 memory 필드에 저장

			try { // <--
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			} // <-- 스레드를 2초간 일시 정지시킴

			System.out.println("CalcSync :: setMemoryBlock < " + Thread.currentThread().getName() + " : " + this.memory);

		}
	}

}
