package section05;

/*
 * minBy(), maxBy() 정적 메소드
 */
import java.util.function.BinaryOperator;

public class OperatorMinByMaxByExample {
	
	public static void main(String[] args) {
		minByOperator();
		maxByOperator();
		minByOperator2();
		maxByOperator2();
	}

	public static void minByOperator() {

		System.out.print("MIN : ");
		BinaryOperator<Fruit> bo = BinaryOperator.minBy((f1, f2) -> Integer.compare(f1.price, f2.price));

		Fruit fruit = bo.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000));
		System.out.println(fruit.name+ " , "+fruit.price);
	}
	
	public static void maxByOperator() {

		System.out.print("MAX : ");
		BinaryOperator<Fruit> bo = BinaryOperator.maxBy((f1, f2) -> Integer.compare(f1.price, f2.price));

		Fruit fruit = bo.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000));
		System.out.println(fruit.name + " , "+fruit.price);
	}
	public static void minByOperator2(){
		System.out.print("이름비교 : ");
		BinaryOperator<Fruit> bo = BinaryOperator.minBy((a, b) -> a.name.compareTo(b.name));

		Fruit fruit = bo.apply(new Fruit("바나나", 6000), new Fruit("수박", 10000));
		System.out.println(fruit.name);
	}
	public static void maxByOperator2() {

		System.out.print("이름비교 : ");
		BinaryOperator<Fruit> bo = BinaryOperator.maxBy((a, b) -> a.name.compareTo(b.name));

		Fruit fruit = bo.apply(new Fruit("파인애플", 6000), new Fruit("수박", 10000));
		System.out.println(fruit.name);
	}
}

class Fruit {
	String name;
	int price;

	Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
}
