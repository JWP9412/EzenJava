package remocon;

public class SmartExample {
	public static void main(String[] args) {
		RemoteControl smarttv = new SmartTv();

		//인터페이스 확장(default method)
		smarttv.setChannel(11);
		RemoteControl.control(smarttv);
		

	}

	
}
