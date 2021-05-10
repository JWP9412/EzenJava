package remocon;

public class SmartTv implements RemoteControl {
	private String model = "����Ʈ TV";
	private int channel;
	private int volume;
	
	
	@Override
	public void setChannel(int channel) {
		this.channel = channel;
		System.out.printf("ä�� ���� : [%s] channel(%d)\n",this.model,this.channel);
	}
	
	// turnOn() �߻� �޼ҵ��� ��ü �޼ҵ�
		public void turnOn() {
			System.out.printf("[%s]SmartTv on\n",this.model);
		}

		// turnOff() �߻� �޼ҵ��� ��ü �޼ҵ�
		public void turnOff() {
			System.out.printf("[%s]SmartTv off\n",this.model);
		}
		
		//setVolume() �߻� �޼ҵ��� ��ü �޼ҵ�
		public void setVolume(int volume){
			if(volume>RemoteControl.MAX_VOLUME) {
				volume = RemoteControl.MAX_VOLUME;
			}else if(volume<RemoteControl.MIN_VOLUME) {
				volume = RemoteControl.MIN_VOLUME;
			}else {
				volume = volume;
			}
			System.out.printf("[%s]���� SmartTV ���� : [%d]\n",model, volume);
		}
	
	

}
