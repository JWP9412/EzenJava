package section05;


/*
 * [ǥ�� API�� �Լ��� �������̽�]
 * Consumer �Լ��� �������̽�
 */
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class DoubleConsumerExample {

	public static void main(String[] args) {
		DoubleConsumer doubleConsumer = d -> System.out.println("Java" + d);
		doubleConsumer.accept(8.76543219);
		
		DoubleConsumer doubleConsumer2 = d -> {
			d *= 2.0;
			System.out.println("Java" + d);
		};
		doubleConsumer2.accept(8.76543219);
	}
}
