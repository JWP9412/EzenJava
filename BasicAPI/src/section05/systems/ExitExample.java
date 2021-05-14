package section05.systems;

/*
 * 시스템 종료
 * - System.exit(exit code)
 * - exitcode : 정상(0), 비정상(0이 아닌값)
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
