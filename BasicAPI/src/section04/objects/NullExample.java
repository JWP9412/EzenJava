package section04.objects;
/*
 * Object.requireNonNull(T obj)
 * - null이 아니면 파라미터로 전달된 값이 리턴
 * - null이면 NullPointerException 예외가 발생
 * - null이면 기본값(default)로 지정된 값을 리턴
 */
import java.util.Objects;

public class NullExample {

	public static void main(String[] args) {
		String str1 = "김깝십";
		String str2 = null;
		
		System.out.println("isNull(str1) : "+ Objects.isNull(str1)); //false
		System.out.println("isNull(str2) : "+ Objects.isNull(str2)); //true
		
		System.out.println("isNull(str1) : "+ Objects.nonNull(str1)); //true
		System.out.println("isNull(str2) : "+ Objects.nonNull(str2)); //false
		
		System.out.println(Objects.requireNonNull(str1));
		//System.out.println(Objects.requireNonNull(str2,"널"));
		try {
			String name = Objects.requireNonNull(str2);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println("str2 : "+Objects.requireNonNull(str2,"기본값"));
		}catch(NullPointerException e){
			System.out.println(e.getLocalizedMessage());
		}
		
		
		
		try {
			String name = Objects.requireNonNull(str2,"이름이 없습니다");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String name = Objects.requireNonNull(str2, ()->"이름이 없다니까요");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
