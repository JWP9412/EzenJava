package section11.array;
/*
 * 정렬(Sort) 
 * - 오름차순 : 작은 값에서 큰 값으로 정렬
 * - 내림차순 : 큰 값에서 작은 값으로 정렬
 */
import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		int[] scores = { 99, 97, 98,77,60 };
		Arrays.sort(scores); //ascending[오름차순]
		for (int i = 0; i < scores.length; i++) {
			System.out.println("오름차순 scores[" + i + "] : " + scores[i]);
		}
		System.out.println();
		for (int i = scores.length-1; i >=0; i--) {//descending[내림차순]
			System.out.println("내림차순 scores[" + i + "] : " + scores[i]);
		}
		System.out.println();
		/*
		String[] names = { "홍길동", "박동수", "김민수","ㅎ","ㄱ" ,"ㅅ"};
		Arrays.sort(names);
		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "] : " + names[i]);
		}
		System.out.println();

		Member m1 = new Member("홍길동");
		Member m2 = new Member("박동수");
		Member m3 = new Member("김민수");

		Member[] members = { m1, m2, m3 };
		Arrays.sort(members);
		for (int i = 0; i < members.length; i++) {
			System.out.println("members[" + i + "].name : " + members[i].name);
		}
		 */
	}

}
