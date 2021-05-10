package remocon;

public interface RemoteControl {
	// ���
	public static int RC_VALUE = 5;
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;

	// �߻� �޼ҵ� = �ڵ����� abstract method �� �ǹǷ� ������ ���� �� ����
	public void turnOn();

	public void turnOff();

	public void setVolume(int volume);

	// ����Ʈ �޼ҵ�
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("���� ó��");
		} else {
			System.out.println("���� ����");
		}
	}

	// ���� �޼ҵ�
	static void changeBattery() {
		System.out.println("������ ��ȯ");
	}

	static void control(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(4);
		rc.setMute(true);
		rc.setVolume(11);
		rc.setVolume(-1);
		rc.turnOff();
	}

	/*
	 * ���� �߰� (smartTv��) 1. ����Ʈ �޼ҵ带 ���ؼ� �������̽��� Ȯ�� 2. ���� ȣȯ���� ����
	 */
	default public void setChannel(int channel) {
		System.out.println("ä�� ����");
	}
}
