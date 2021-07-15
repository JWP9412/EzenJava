package instaneMemberClass;

public class Product2Example {

	public static void main(String[] args) {
		Product2 pd = new Product2("Á¦Ç°1");
		
		Product2.Tv tv = pd.newTv();
		pd.makeTv(100);
		System.out.println("Tv : total = " + tv.total());
		
		pd.saleTv(50);
		System.out.println("Tv : total = " + tv.total());
		
		
	}

}
