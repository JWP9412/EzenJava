package anonymous.Interface;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		//anony.field.turnOn();
		//anony.field.turnOff();
		anony.on();
		anony.off();
		anony.audio();
		anony.method2(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("SmartTv on");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("SmartTv off");
				
			}
		});
	}

}
