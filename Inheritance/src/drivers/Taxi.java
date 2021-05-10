package drivers;

public class Taxi extends Vehicle { //자식클래스
	@Override
	public void run() {
		System.out.println("택시가 달립니다");
	}

}
