package remocon;

public class TelevisonExample {

	public static void main(String[] args) {
		Television tv = new Television("�Ｚ");
		//RemoteControl audio = new Audio();
		
		tv.turnOn();
		tv.setVolume(5);
		tv.setMute(true);
		tv.setVolume(11);
		tv.setVolume(-1);
		tv.turnOff();

	}

}
