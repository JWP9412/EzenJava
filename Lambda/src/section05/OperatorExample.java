package section05;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = { 92, 95, 87 ,11, 999 };
	
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

	public static void main(String[] args) {
		// �ִ밪 ���
		int max = maxOrMin(
				(a, b) -> {
			if (a >= b)
				return a;
			else
				return b;
		});
		System.out.println("MAX : " + max);
		
		// �ּҰ� ���
				int min = maxOrMin(
						(a, b) -> {
					if (a <= b)
						return a;
					else
						return b;
				});
				System.out.println("MIN : " + min);
	}

}
