package section05;
/*
 * Function의 순차적 연결
 * 	- Function<>.compose() 을 시뮬레이션
 */
import java.util.function.Function;

public class FunctionAndThenComposeExample3 {

	public static void main(String[] args) {
		Function<Member, Address> fA;
		Function<Address, String> fB;
		Function<Member, String> fAB;
		String city;
		
		fA = (Member member) -> {
			System.out.printf("fA : (%s) (%s)\n",
					member.getAddress().getCountry(),
					member.getAddress().getCity());
			return member.getAddress();
		};
		fB = (Address addr) -> {
			System.out.printf("fB : (%s) (%s) \n",addr.getCountry(),addr.getCity());
			return addr.getCity() + "[시]";
		};
		
		
		fAB = fB.compose(fA);
		city = fAB.apply(
				new Member("HONG","HGD",new Address("Kor", "Seoul"))
				);
		System.out.println("거주 도시 : "+city);
			
	}

}
