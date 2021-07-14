package casting;

public class Driver {//Vehicle을 이용하는 클래스
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			System.out.println("Vehicle is Bus!!!");
			Bus bus = (Bus)vehicle;
			bus.run(2);
			System.out.println(((Bus) vehicle).getStation());
		}else if (vehicle instanceof Taxi) {
			System.out.println("Vehicle is Taxi!!!");
//			Taxi taxi = (Taxi)vehicle;
//			Taxi.run(2);
			vehicle.run();
		}else {
			System.out.println("Vehicle is Unknown!!!");
		}
		

	}

}
