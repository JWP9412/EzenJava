package runtimeExceptions;

public class DivideExceptionExample3 {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		int z = 0;
		
		if(y!=0) {
			z=x/y;
			System.out.println("z = " + z);
		}else {
			System.out.println("x�� ���� 0���� �������� �߽��ϴ�");
		}

		

	}

}
