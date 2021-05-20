package section05;

/*
 * [ǥ�� API�� �Լ��� �������̽�]
 * Consumer �Լ��� �������̽�
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
		consumer.accept("�ڹ�");
	}
}
