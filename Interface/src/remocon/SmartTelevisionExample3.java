package remocon;

public class SmartTelevisionExample3 {

	public static void main(String[] args) {
		RemoteControl stv = new SmartTelevision();
		//stv.search("ezjava.com");
		stv.turnOn();
		stv.setVolume(15);
		stv.turnOff();
		

	}

}
