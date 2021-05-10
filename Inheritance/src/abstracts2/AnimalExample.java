package abstracts2;

public class AnimalExample {

	public static void main(String[] args) {
		animalSpecify(new Bird());
		animalSpecify(new Fish());
		animalSpecify(new Insect());
		animalSpecify(new Dog());
	}

	public static void animalSpecify(Animal animal) {
		System.out.printf("[%s]ÀÇ Æ¯Â¡\n", animal.kind);
		animal.breath();
		animal.move();
		animal.sound();
		System.out.println("-----------------------------");
	}

}
