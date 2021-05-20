package section04;
/*
 * �޼ҵ� �ȿ� ����� ���� ����
 * 	- ���ú����� ���ٽĿ��� �����ϰ� �Ǹ�
 * 	  �� ���ú����� finalƯ���� ���� �ȴ�.
 * 	- final : ����� ���� ������ �� ����.
 * 	- ���ú��� : �޼ҵ��� �Ķ����, �޼ҵ忡�� ����� ����
 * 				(int arg, int local)
 * 	- �ǰ� : ���ú����� ���ٽĿ��� ����ϰ� �Ǹ� ������ ��������� final�� ����Ͽ�
 * 			 ���� ������ �� ���ٴ� ���� ���
 */
public class UsingLocalVariable {
	void method(final int arg) {//arg�� final Ư���� ����
		final int local = 40; //localVar �� final Ư���� ����
		int local2 = 50;
			
		//local�� ���ٽĿ��� �����ϹǷ� ������ ����(final Ư���� ����)
		//arg += local;
		//local += local2;
		
		//���ٽ�
		MyFunctionalInterface fi = () ->{
			//���� ���� �б�
			System.out.println("arg : "+arg);
			System.out.println("local : "+local + "\n");
		};
		fi.method();
		//local2�� ���ٽĿ��� �������� �ʾ����Ƿ� ������ ����(final Ư���� ���� ����)
		local2 += local;
		System.out.println("local2 : "+local2);
	}
}
