package instaneMemberClass;

public class ProductExample2 {

	public static void main(String[] args) {
		Product pd = new Product("Samsung");
		
		Product.Tv tv = pd.new Tv();
		Product.Radio radio = pd.new Radio();
		Product.Smartphone smartphone = pd.new Smartphone();
		smartphone.sale(10);
	}

}
