package remocon;

public class Television implements RemoteControl {
	// 필드
	private int volume;
	private String model;
	
	public Television() {}
	public Television(String model) {
		this.model = model;
	}

	// turnOn() 추상 메소드의 실체 메소드
	public void turnOn() {
		System.out.printf("[%s]Tv on\n",this.model);
	}

	// turnOff() 추상 메소드의 실체 메소드
	public void turnOff() {
		System.out.printf("[%s]Tv off\n",this.model);
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
		System.out.printf("[%s]현재 TV 볼륨 : [%d]\n",model, volume);
	}
	@Override
	public void setMute(boolean mute) {
		// TODO Auto-generated method stub
		RemoteControl.super.setMute(mute);
		if(mute) {
			System.out.printf("[%s]무음 처리\n",this.model);
		}else {
			System.out.printf("[%s]무음 해제\n",this.model);
		}
	}

}
