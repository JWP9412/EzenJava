package section05;
/*
 * Function의 순차적 연결
 * 	- Function<>.andThen() 처리를 시뮬레이션
 */
import java.util.function.Function;

public class FunctionAndThenComposeExample2 {

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
		
		Member member = new Member("홍길동","HGS",new Address("조선","한양"));
		Address address = fA.apply(member);
		
		fB = (Address addr) -> {
			System.out.printf("fB : (%s) (%s) \n",addr.getCountry(),addr.getCity());
			return addr.getCity() + "[시]";
		};
		fB.apply(address);	
	}

}
