package phone;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("삼성", "흰색", 10);

		System.out.println("model : " + dmbCellPhone.model);
		System.out.println("color : " + dmbCellPhone.color);

		System.out.println("channel : " + dmbCellPhone.channel);
		System.out.println();
		System.out.println("DmbCellPhone.channel : "+ dmbCellPhone.channel);
		//상속받은 부모의 메소드
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("hi there");
		dmbCellPhone.receiveVoice("안녕하세영 저는 홍길동");
		dmbCellPhone.sendVoice("아 hi");
		dmbCellPhone.hangUp();
		System.out.println();
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		System.out.println("DmbCellPhone.channel : "+ dmbCellPhone.channel);
	}

}
