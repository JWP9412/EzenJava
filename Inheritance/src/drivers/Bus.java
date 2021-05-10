package drivers;

public class Bus extends Vehicle { //자식클래스
	@Override
	public void run() {
		System.out.println("버스가 달립니다");
	}

}
