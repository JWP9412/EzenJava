package section05;
/*
 * [Supplier �Լ��� �������̽�]
 * - ���ϰ��� �ִ� �޼ҵ带 ������ �ִ� �Լ��� �������̽�
 * 	@FunctionalInterface
 * public interface IntSupplier{
 * 			int getAsInt();
 * }
 */
import java.util.function.IntSupplier;

public class SupplierExample {

	public static void main(String[] args) {
		IntSupplier intSupplier = () ->{
			int num = (int)(Math.random()*45)+1;
			return num;
		};
		for(int i=0; i<6;i++){
			int num = intSupplier.getAsInt();
			System.out.println("���� �� : "+num);
		}
		

	}

}
