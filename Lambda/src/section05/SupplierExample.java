package section05;
/*
 * [Supplier 함수적 인터페이스]
 * - 리턴값이 있는 메소드를 가지고 있는 함수적 인터페이스
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
			System.out.println("눈의 수 : "+num);
		}
		

	}

}
