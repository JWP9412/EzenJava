package instaneMemberClass;

public class ProductExample {

	public static void main(String[] args) {
		Product pd = new Product();
		
		Product.Tv tv = pd.new Tv();
		Product.Radio radio = pd.new Radio();
		Product.Smartphone smartphone = pd.new Smartphone();
	}

}
