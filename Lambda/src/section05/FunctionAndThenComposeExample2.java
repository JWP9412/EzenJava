package section05;
/*
 * Function�� ������ ����
 * 	- Function<>.andThen() ó���� �ùķ��̼�
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
		
		Member member = new Member("ȫ�浿","HGS",new Address("����","�Ѿ�"));
		Address address = fA.apply(member);
		
		fB = (Address addr) -> {
			System.out.printf("fB : (%s) (%s) \n",addr.getCountry(),addr.getCity());
			return addr.getCity() + "[��]";
		};
		fB.apply(address);	
	}

}
