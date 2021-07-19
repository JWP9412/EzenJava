package section05;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class OperatorExample {
	
	public static void main(String[] args) {
		// 최대값 얻기
		int max = maxOrMin(
				(a, b) -> {
			if (a >= b)
				return a;
			else
				return b;
		});
		System.out.println("MAX : " + max);
		
		// 최소값 얻기
				int min = maxOrMin(
						(a, b) -> {
					if (a <= b)
						return a;
					else
						return b;
				});
				System.out.println("MIN : " + min);
	}
	
	
	private static int[] scores = { 1,92, 95, 87 ,11, 999 };
	
	/*
	 * Binary Operator
	 * result = left + right;
	 */
	public static int maxOrMin(IntBinaryOperator op) {
		int result = scores[0];
		for (int score : scores) {
			System.out.println("score : "+ score + " | result : "+result);
			result = op.applyAsInt(result, score);
		}
		return result;
	}


}
