package drivers2;

public class Driver {//Vehicle을 이용하는 클래스
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
