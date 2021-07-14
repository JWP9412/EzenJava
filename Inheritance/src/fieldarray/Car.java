package fieldarray;


public class Car {
	// 필드

	Tire[] tires = { 
			new Tire("[1]앞왼쪽", 6), 
			new Tire("[2]앞오른쪽", 2), 
			new Tire("[3]뒤왼쪽", 3), 
			new Tire("[4]뒤오른쪽", 4)
	};
	
	int run() {
		System.out.println("[자동차가 달립니다]");
		for(int i=0; i<tires.length;i++) {
			Tire tire = tires[i];
			if(tire.roll()==false) {
				stop();
				return (i+1);
				
			}
		}
		return 0;
	}

	private void stop() {
		System.out.println("[자동차가 멈춥니다]");
		
	}
		
	

	String getLocation(int loc) {
		if(loc >= 1 && loc <=4) {
			Tire tire = this.tires[loc-1];
			return tire.location;
		}
		return null;
	}
	void changeTire(Tire tire, int loc) {
		System.out.println(tire.location + "교체");
		if(loc >=1 &&loc <=4) {
			this.tires[loc-1] = tire;
		}
}
	}
