package remocon;

public class Television implements RemoteControl {
	// �ʵ�
	private int volume;
	private String model;
	
	public Television() {}
	public Television(String model) {
		this.model = model;
	}

	// turnOn() �߻� �޼ҵ��� ��ü �޼ҵ�
	public void turnOn() {
		System.out.printf("[%s]Tv on\n",this.model);
	}

	// turnOff() �߻� �޼ҵ��� ��ü �޼ҵ�
	public void turnOff() {
		System.out.printf("[%s]Tv off\n",this.model);
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
		System.out.printf("[%s]���� TV ���� : [%d]\n",model, volume);
	}
	@Override
	public void setMute(boolean mute) {
		// TODO Auto-generated method stub
		RemoteControl.super.setMute(mute);
		if(mute) {
			System.out.printf("[%s]���� ó��\n",this.model);
		}else {
			System.out.printf("[%s]���� ����\n",this.model);
		}
	}

}
