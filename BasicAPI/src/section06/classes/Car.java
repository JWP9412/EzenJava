package section06.classes;

public class Car {
	public String model;
	int width;
	String s;

	public Car() {
	}

	public Car(String model) {
		this.model = model;
	}

	Car(int width) {
		this.width = width;
	}

	Car(int width, String s) {
		this.width = width;
		this.s = s;
	}

	String getCarName() {
		return this.s;
	}

	void setCarName(String s) {
		this.s = s;
	}

	void setCarWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return String.format("Car : Width[%d], s[%s] \n" ,this.width,this.s);
				}

}
