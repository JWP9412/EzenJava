package phone;

public class DmbCellPhone extends Cellphone {
	int channel;

	DmbCellPhone(String model, String color, int channel) {
		this.model = model;//�θ�
		this.color = color;//�θ�
		this.channel = channel;//�ڽ�
	}

	void turnOnDmb() {
		System.out.println("ä�� :" + channel + "�� DMB ��� ���� ����");
	}

	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä�� :" + channel + "������ �ٲ�");
	}

	void turnOffDmb() {
		System.out.println("���� ����");
	}
}
