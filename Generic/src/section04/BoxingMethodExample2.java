package section04;

public class BoxingMethodExample2 {

	public static void main(String[] args) {
		Util.<String>printUtil("��ƿ��Ʈ��");
		Util.<Integer>printUtil(12345);
		Util.<Float>printUtil(3.14159f);
		Util.<Character>printUtil('A');		
		int x = (int)'0';
		System.out.println(x);
	}

}