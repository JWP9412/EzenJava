package section05.systems;

/*
 * �ý��� ����
 * - System.exit(exit code)
 * - exitcode : ����(0), ������(0�� �ƴѰ�)
 */
public class ExitExample {

	public static void main(String[] args) {
		int x = 0;

		while (true) {
			x += 1;
			if (x > 100) {
				//System.exit(0);
				System.exit(x);
			}
			if (x > 900) {
				break;
			}
			
			System.out.println(x);
		}
		System.out.println("end");
	}

}
