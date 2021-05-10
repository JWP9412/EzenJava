package drivers2;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();

		
		driver.drive(new Bus());
		driver.drive(new Taxi());
		driver.drive(new Vehicle());
		driver.drive(new Truck());
		
	}

}
