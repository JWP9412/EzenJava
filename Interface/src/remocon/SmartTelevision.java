package remocon;

public class SmartTelevision implements Searchable, RemoteControl {

	@Override
	public void search(String url) { // Searchable
		System.out.printf("[SmartTelevision] search(%s)\n",url);

	}
	
	@Override
	public void turnOn() { // RemoteControl
		System.out.println("[SmartTelevision] on");

	}

	@Override
	public void turnOff() {// RemoteControl
		System.out.println("[SmartTelevision] off");

	}

	@Override
	public void setVolume(int volume) {// RemoteControl
		System.out.println("[SmartTelevision] setVolume : "+volume);

	}
}
