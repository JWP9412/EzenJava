package exam01;

import java.util.Arrays;

public class Ar {

	public static void main(String[] args) {
		int[] scores = { 99, 97, 11, 9999,98, 77, 60 };
		Arrays.sort(scores);
		
		
		System.out.println("오름차순");
		for(int i=0; i<scores.length;i++) {
				System.out.print(scores[i]+ " ");
		}
		
		System.out.println("\n내림차순");
		for(int k=scores.length-1; k>=0;k--) {
			System.out.print(scores[k]+ " ");
		}

	}

}
