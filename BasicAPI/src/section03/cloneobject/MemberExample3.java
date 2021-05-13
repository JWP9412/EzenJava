package section03.cloneobject;
//복제 객체를 변경하더라도 원본 객체는 변함 없음
public class MemberExample3 {

	public static void main(String[] args) {
		int x = 10;
		int y=x;
		
		System.out.println("[원]x : "+ x);
		System.out.println("[복]y : "+ y);
		y=20;
		System.out.println("[원]x : "+ x);
		System.out.println("[복]y : "+ y);
		
		
		
		
		
	}

}
