package remocon;

public class RemoteContorllerExample2 {
	public static void main(String[] args) {
		//RemoteControl rc = new RemoteControl(); 
		//�������̽��� ��ü��  ������ �� ����
		
		RemoteControl tv = new Television();
		RemoteControl audio = new Audio();
		
		control(tv);
		System.out.println();
		control(audio);
		

	}

	static void control(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(2);
		rc.setMute(true);
		rc.setVolume(11);
		rc.setVolume(-1);
		rc.turnOff();
	}
}
