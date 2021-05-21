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
		
		System.out.println("[���� ó��]");
		Member member = new Member("Hong","ghd",null);
		consumerA.accept(member);
		consumerB.accept(member);
		
		System.out.println("[andThen ó��]");
		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("Hong","ghd",null));
	}
}
