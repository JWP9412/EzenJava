package remocon;

public class SmartTv implements RemoteControl {
	private String model = "스마트 TV";
	private int channel;
	private int volume;
	
	
	@Override
	public void setChannel(int channel) {
		this.channel = channel;
		System.out.printf("채널 변경 : [%s] channel(%d)\n",this.model,this.channel);
	}
	
	// turnOn() 추상 메소드의 실체 메소드
		public void turnOn() {
			System.out.printf("[%s]SmartTv on\n",this.model);
		}

		// turnOff() 추상 메소드의 실체 메소드
		public void turnOff() {
			System.out.printf("[%s]SmartTv off\n",this.model);
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
			System.out.printf("[%s]현재 SmartTV 볼륨 : [%d]\n",model, volume);
		}
	
	

}
