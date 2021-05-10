package drivers;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();

		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Vehicle vehicle = new Vehicle();
		
		vehicle.run();
		//↓자동타입변환
		driver.drive(bus);
		driver.drive(taxi);
	}

}
