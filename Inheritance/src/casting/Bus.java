package casting;

public class Bus extends Vehicle { //자식클래스
	int station;
	
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
		station++;
	}
	
	
	public void run(int station) {
		System.out.println("버스가 달립니다. "+station);
		this.station += station;
	}
	
	int getStation() {
		return station;
	}

}
