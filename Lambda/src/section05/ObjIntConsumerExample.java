package section05;

/*
 * [표준 API의 함수적 인터페이스]
 * Consumer 함수적 인터페이스
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
