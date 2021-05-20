package section05;

/*
 * [Supplier �Լ��� �������̽�]
 * - ���ϰ��� �ִ� �޼ҵ带 ������ �ִ� �Լ��� �������̽�
 * 	@FunctionalInterface
 * public interface IntSupplier{
 * 			int getAsInt();
 * }
 */

import java.util.function.Supplier;

public class SupplierExample2 {

	public static void main(String[] args) {
		
		System.out.println();
		Supplier<Integer> supplier = () ->{
			int num = (int)(Math.random()*6)+1;
			return num;
		};
		for(int i=0; i<6;i++){
			int num = supplier.get();
			System.out.println("���� �� : "+num);
		}
		

	}

}
