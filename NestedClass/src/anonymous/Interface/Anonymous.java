package anonymous.Interface;

public class Anonymous {
	RemoteControl field = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("TV�� �մϴ�");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV�� ���ϴ�");
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
				System.out.println("Audio�� �մϴ�");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio�� ���ϴ�");			
			}
		};
		audio.turnOn();
		audio.turnOff();
		
		
	}
	void method2(RemoteControl rc	) {
		rc.turnOff();
	}
}
