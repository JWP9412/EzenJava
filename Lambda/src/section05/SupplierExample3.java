package section05;

import java.util.function.LongSupplier;

/*
 * [Supplier 함수적 인터페이스]
 * - 리턴값이 있는 메소드를 가지고 있는 함수적 인터페이스
 * 	@FunctionalInterface
 * public interface IntSupplier{
 * 			int getAsInt();
 * }
 */

import java.util.function.Supplier;

public class SupplierExample3 {

	public static void main(String[] args) {
		
		System.out.println();
		LongSupplier supplier = () ->{
			long num = (long)(Math.random()*6)+1;
			return num;
		};
		for(int i=0; i<6;i++){
			long num = supplier.getAsLong();
			System.out.println("눈의 수 : "+num);
		}
		

	}

}
