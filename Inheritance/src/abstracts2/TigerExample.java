package abstracts2;

public class TigerExample {

	public static void main(String[] args) {
		Animal animal = new Tiger();
		animal.breath();
		
		Cat cat = (Cat)animal;
		cat.breath();
		
		Tiger tiger =(Tiger)animal;
		tiger.breath();
	}

	
	

}
