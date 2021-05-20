package section05;

/*
 * [표준 API의 함수적 인터페이스]
 * Consumer 함수적 인터페이스
 */
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {
		BiConsumer<String, String> biConsumer = (t, u) -> System.out.println(t + u);
		biConsumer.accept("Java", "8");

		BiConsumer<String, Integer> biInteger = (t, u) -> System.out.println(t + u);
		biInteger.accept("Java", 88);
	}

}
