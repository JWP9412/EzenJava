package section03.deepclone;
//복제 객체를 변경하더라도 원본 객체는 변함 없음
public class MemberExample3 {

	public static void main(String[] args) {
		//원본 객체 생성
		Member2 org = new Member2("java",30,new int[] {90,100}, new Car("소나타"));

		
		//복제 객체를 얻은 후에 참조 객체의 값을 변경
		Member2 clo = org.getMember();
		clo.name = "Corba";
		clo.scores[0]=70;
		clo.scores[1]=80;
		clo.car.model = "그랜져";
		
		System.out.println("[복제 객체의 필드값]");
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
		
		System.out.println("[원본 객체의 필드값]");
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
