package remocon;
/*
 * �͸� ���� Ŭ����
 * 1. ��ȸ�� ��ü ����
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
			
		}; // �ݵ�� �����ݷ�(;)�� �־�� ��
		
		RemoteControl.control(radio);
	}

}
