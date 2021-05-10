package classCastException;

public class ClassCastExceptionExample3 {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);

	}
	public static void changeDog(Animal animal) {
		try {
			System.out.println("Dog");
			Dog dog = (Dog) animal;
		}
		catch(ClassCastException e) {
			System.out.println("animal은 Dog가 아닙니다");
			Cat cat = (Cat)animal;
		}
	}
}
