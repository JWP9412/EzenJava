package section05;

/*
 * [ǥ�� API�� �Լ��� �������̽�]
 * Consumer �Լ��� �������̽�
 */
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ObjIntConsumerExample {

	public static void main(String[] args) {

		ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t + i);
		objIntConsumer.accept("Java", 8);

	}

}
