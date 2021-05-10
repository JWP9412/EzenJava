package remocon;

public interface RemoteControl {
	// 상수
	public static int RC_VALUE = 5;
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;

	// 추상 메소드 = 자동으로 abstract method 가 되므로 구현을 가질 수 없다
	public void turnOn();

	public void turnOff();

	public void setVolume(int volume);

	// 디폴트 메소드
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리");
		} else {
			System.out.println("무음 해제");
		}
	}

	// 정적 메소드
	static void changeBattery() {
		System.out.println("건전지 교환");
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
	 * 새로 추가 (smartTv용) 1. 디폴트 메소드를 통해서 인터페이스를 확장 2. 하위 호환성을 유지
	 */
	default public void setChannel(int channel) {
		System.out.println("채널 변경");
	}
}
