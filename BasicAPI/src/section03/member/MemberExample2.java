package section03.member;

public class MemberExample2 {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");

		if (obj1.equals(obj2) || obj1.equals(obj3)) {
			if (obj1.equals(obj2)) {
				System.out.println("1�� 2�� ����");
			}
			if (obj1.equals(obj3)) {
				System.out.println("1�� 3�� ����");
			}
		} else {
			if (!obj1.equals(obj2)) {// (obj1.equals(obj2) !=true)
				System.out.println("1�� 2�� ����x");
			}

			if (!obj1.equals(obj3)) {
				System.out.println("1�� 3�� ����x");
			}
		}
	}
}
