package section05;
/*
 * Function �Լ��� �������̽�
 * @FunctionalInterface
 *	public interface Function<T, R> {
 *
 *  R apply(T t);
 *  }
 */
import java.util.function.Function;

public class FunctionExample1 {
	public static void main(String[] args) {
		Function<Integer,String> function = t ->{
			String format = String.format("Function: %d", t);
			return format;
		};
		String str = function.apply(1234);
		System.out.println(str);
	}
}
