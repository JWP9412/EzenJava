package remocon;
/*
 * 익명 구현 클래스
 * 1. 일회성 객체 생성
 */
public class AnonymousExample {

	public static void main(String[] args) {
		RemoteControl radio = new RemoteControl() {

			
			@Override
			public void turnOn() {
				System.out.println("Radio on");
			}

			@Override
			public void turnOff() {
				System.out.println("Radio off");
			}

			@Override
			public void setVolume(int volume) {
				System.out.println("Radio volume : " + volume);
			}
			
		}; // 반드시 세미콜론(;)이 있어야 함
		
		RemoteControl.control(radio);
	}

}
