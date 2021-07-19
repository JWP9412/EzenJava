package section03;

public class ProductExample {

	public static void main(String[] args) {
		Product<Car, String> pcar = new Product<Car, String>();
		pcar.setKind(new Car("Å×½½¶ó"));
		pcar.setModel("µðÁ©");
		
		Car car = pcar.getKind();
		String carModel = pcar.getModel();
		System.out.printf("car(%s) carModel(%s)\n", car,carModel);
		
	}

}
