package drivers;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();

		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Vehicle vehicle = new Vehicle();
		
		vehicle.run();
		//���ڵ�Ÿ�Ժ�ȯ
		driver.drive(bus);
		driver.drive(taxi);
	}

}
