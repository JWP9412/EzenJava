package exam04;

public class Car {
	Car(){
		System.out.println("Car");
	}
	
	class Tire{
		Tire(){
			System.out.println("Tire");
		}
	}
	
	static class Engine{
		Engine(){
			System.out.println("Engine");
		}
	}
}
