package casting;

public class Driver {//Vehicle�� �̿��ϴ� Ŭ����
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			System.out.println("Vehicle is Bus!!!");
			vehicle.run();
		}else if (vehicle instanceof Taxi) {
			System.out.println("Vehicle is Taxi!!!");
			vehicle.run();
		}else {
			System.out.println("Vehicle is Unknown!!!");
		}
		

	}

}
