package anonymous.Interface;

public class Anonymous {
	RemoteControl field = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("TV¸¦ ÄÕ´Ï´Ù");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV¸¦ ²ü´Ï´Ù");
		}
	};
	
	void on() {
		this.field.turnOn();
	}
	
	void off() {
		this.field.turnOff();
	}
	
	void audio() {
		RemoteControl audio = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("Audio¸¦ ÄÕ´Ï´Ù");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio¸¦ ²ü´Ï´Ù");			
			}
		};
		audio.turnOn();
		audio.turnOff();
		
		
	}
	void method2(RemoteControl rc	) {
		rc.turnOff();
	}
}
