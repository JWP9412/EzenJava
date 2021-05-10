package remocon;

public class Audio implements RemoteControl {
	// 필드
	private int volume;

	// turnOn() 추상 메소드의 실체 메소드
	public void turnOn() {
		System.out.println("Audio on");
	}

	// turnOff() 추상 메소드의 실체 메소드
	public void turnOff() {
		System.out.println("Audio off");
	}
	
	//setVolume() 추상 메소드의 실체 메소드
	public void setVolume(int volume){
		if(volume>RemoteControl.MAX_VOLUME) {
			volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			volume = RemoteControl.MIN_VOLUME;
		}else {
			volume = volume;
		}
		System.out.println("현재 Audio 볼륨 : " + volume);
	}

}
