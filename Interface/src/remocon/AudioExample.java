package remocon;

public class AudioExample {

	public static void main(String[] args) {
		Audio audio = new Audio();
		//RemoteControl audio = new Audio();
		
		audio.turnOn();
		audio.setVolume(5);
		audio.setMute(true);
		audio.setVolume(11);
		audio.setVolume(-1);
		audio.turnOff();
		System.out.println(audio.MAX_VOLUME);

	}

}
