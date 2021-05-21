package section05;

import java.util.function.Consumer;

public class ConsumerAndThenExample2 {
	public static void main(String[] args) {
		Consumer<Member> consumerA = (m)->{
			System.out.println("consumerA(이름)");
			System.out.println(">	한글 이름 : " + m.getName());
			System.out.println(">	 아 이 디 : " + m.getId());
		};
		
		Consumer<Member> consumerB = (m)->{
			System.out.println("consumerB(주소)");
			Address address = m.getAddress();
			System.out.println(">	나 라 : " + address.getCountry());
			System.out.println(">	주 소 : " + address.getCity());
		};
		
		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("홍길동","Hong",new Address("조선" , "한양")));
	}
}
