package phone;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�Ｚ", "���", 10);

		System.out.println("model : " + dmbCellPhone.model);
		System.out.println("color : " + dmbCellPhone.color);

		System.out.println("channel : " + dmbCellPhone.channel);
		System.out.println();
		System.out.println("DmbCellPhone.channel : "+ dmbCellPhone.channel);
		//��ӹ��� �θ��� �޼ҵ�
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("hi there");
		dmbCellPhone.receiveVoice("�ȳ��ϼ��� ���� ȫ�浿");
		dmbCellPhone.sendVoice("�� hi");
		dmbCellPhone.hangUp();
		System.out.println();
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		System.out.println("DmbCellPhone.channel : "+ dmbCellPhone.channel);
	}

}
