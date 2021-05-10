package remocon;

public class RemoteContorllerExample {
	public static void main(String[] args) {
		System.out.println("RemoteControl.MAX_VOLUME : " + RemoteControl.MAX_VOLUME);
		System.out.println("RemoteControl.MIN_VOLUME : " + RemoteControl.MIN_VOLUME);
		System.out.println("RemoteControl.RC_VALUE : " + RemoteControl.RC_VALUE);
		
		RemoteControl.changeBattery();
	}
}
