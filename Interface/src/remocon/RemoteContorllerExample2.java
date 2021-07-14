package remocon;

public class RemoteContorllerExample2 {
	public static void main(String[] args) {
		//RemoteControl rc = new RemoteControl(); 
		//인터페이스는 객체로  생성할 수 없다
		
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
