package section05;

/*
 * [표준 API의 함수적 인터페이스]
 * Consumer 함수적 인터페이스
 */
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {

	public static void main(String[] args) {
		normal();
		
		Consumer<String> consumer = t -> System.out.println(t + 8);
		// Consumer<String> consumer = (t) -> {System.out.println(t+8);};
		consumer.accept("java");

		Consumer<Integer> conInteger = t -> System.out.println(t + t);
		conInteger.accept(10);


	}

	static void normal() {
		Consumer<String> consumer = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t + "15");
			}
		};
		consumer.accept("자바");
	}
}
