package remocon;

public class RemoteContorllerExample3 {
	public static void main(String[] args) {
		RemoteControl tv = new Television("»ï¼º");
		RemoteControl audio = new Audio();
		
		RemoteControl.control(tv);
		System.out.println();
		RemoteControl.control(audio);
		System.out.println();
		RemoteControl.control(new Television("LG"));

	}

	
}
