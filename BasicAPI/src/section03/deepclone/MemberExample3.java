package section03.deepclone;
//���� ��ü�� �����ϴ��� ���� ��ü�� ���� ����
public class MemberExample3 {

	public static void main(String[] args) {
		//���� ��ü ����
		Member2 org = new Member2("java",30,new int[] {90,100}, new Car("�ҳ�Ÿ"));

		
		//���� ��ü�� ���� �Ŀ� ���� ��ü�� ���� ����
		Member2 clo = org.getMember();
		clo.name = "Corba";
		clo.scores[0]=70;
		clo.scores[1]=80;
		clo.car.model = "�׷���";
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("name : "+clo.name);
		System.out.println("age : "+clo.age);
		System.out.print("scores : {");
		for(int i=0; i<clo.scores.length;i++) {
			System.out.print(clo.scores[i]);
			System.out.print((i==(clo.scores.length-1))?"":",");
		}
		System.out.println("}");
		System.out.println("car : "+clo.car.model);
		
		System.out.println();
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("name : "+org.name);
		System.out.println("age : "+org.age);
		System.out.print("scores : {");
		for(int i=0; i<org.scores.length;i++) {
			System.out.print(org.scores[i]);
			System.out.print((i==(org.scores.length-1))?"":",");
		}
		System.out.println("}");
		System.out.println("car : "+org.car.model);
		
	}

}
