package remocon;

public class SmartExample {
	public static void main(String[] args) {
		RemoteControl smarttv = new SmartTv();

		//�������̽� Ȯ��(default method)
		smarttv.setChannel(11);
		RemoteControl.control(smarttv);
		

	}

	
}
