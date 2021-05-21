package section05;
/*
 * Function�� ������ ����
 * 	- Function<>.compose() �� �ùķ��̼�
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
			return addr.getCity() + "[��]";
		};
		
		
		fAB = fB.compose(fA);
		city = fAB.apply(
				new Member("HONG","HGD",new Address("Kor", "Seoul"))
				);
		System.out.println("���� ���� : "+city);
			
	}

}
