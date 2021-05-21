package section05;
/*
 * Function�� ������ ����
 * 	- Function<>.andThen()
 * 	- Function<>.compose()
 */
import java.util.function.Function;

public class FunctionAndThenComposeExample {

	public static void main(String[] args) {
		Function<Member, Address> fA;
		Function<Address, String> fB;
		Function<Member, String> fAB;
		String city;
		
		fA = (m) -> m.getAddress();
		fB = (a) -> a.getCity();
		
		fAB = fA.andThen(fB);
		city = fAB.apply(
				new Member("HONG","hzhz",new Address("Kor", "Seoul"))
				);
		System.out.println("���� ���� : "+city);
		
		fAB = fB.compose(fA);
		city = fAB.apply(
				new Member("HONG","hzhz",new Address("Kor", "Seoul"))
				);
		System.out.println("���� ���� : "+city);
			
	}

}
