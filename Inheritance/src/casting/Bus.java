package casting;

public class Bus extends Vehicle { //자식클래스
	int station;
	
	@Override
	public void run() {
		System.out.println("버스가 달립니다");
		station++;
	}
	int getStation() {
		return station;
	}

}
