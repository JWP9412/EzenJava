package casting;

public class RunExample2 {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		vehicle.run();
		
//		Vehicle에는 메소드run(int)이 존재하지 않음
//		vehicle.run(10);
		
		
		//error
		//System.out.println("station: "+ vehicle.getStation());
		
		Bus bus = (Bus)vehicle;
		System.out.println("station 1: "+ bus.getStation());
		bus.run(10);
		
		System.out.println("station 2: "+ ((Bus)vehicle).getStation());
	}

}
