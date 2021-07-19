package section05;

import java.util.function.Consumer;

public class ConsumerAndThenExample {
	public static void main(String[] args) {
		Consumer<Member> consumerA = (m)->{
			System.out.println("consumerA : " + m.getName());
		};
		
		Consumer<Member> consumerB = (m)->{
			System.out.println("consumerB : " + m.getId() +"\n");
		};
		
		System.out.println("[俺喊 贸府]");
		Member member = new Member("Hong","ghd",null);
		consumerA.accept(member);
		consumerB.accept(member);
		
		System.out.println("[andThen 贸府]");
		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("Kim","LLL",null));
	}
}
