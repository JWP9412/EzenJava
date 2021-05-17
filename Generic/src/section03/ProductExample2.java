package section03;

public class ProductExample2 {

	public static void main(String[] args) {
		Product<Tv, String> ptv = new Product<Tv, String>();
		ptv.setKind(new Tv());
		ptv.setModel("½º¸¶Æ®Tv");
		Tv tv = ptv.getKind();
		String tvModel = ptv.getModel();
		System.out.printf("tv(%s) tvModel(%s)\n", tv,tvModel);
		
		
	}

}
