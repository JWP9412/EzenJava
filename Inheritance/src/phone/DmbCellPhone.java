package phone;

public class DmbCellPhone extends Cellphone {
	int channel;

	DmbCellPhone(String model, String color, int channel) {
		this.model = model;//부모
		this.color = color;//부모
		this.channel = channel;//자신
	}

	void turnOnDmb() {
		System.out.println("채널 :" + channel + "번 DMB 방송 수신 시작");
	}

	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 :" + channel + "번으로 바꿈");
	}

	void turnOffDmb() {
		System.out.println("수신 종료");
	}
}
