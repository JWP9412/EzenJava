package section05.systems;
/*
 * 시스템 종료
 * - System.exit(exit code)
 * - exitcode : 정상(0), 비정상(0이 아닌값)
 */
public class ExitSecurityExample {

	public static void main(String[] args) {
		// 보안 관리자 설정
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkExit(int status) {
				System.out.println("setSecurityManager : "+ status);
				if (status != 5) {
					throw new SecurityException(String.valueOf(status));
				}
			}
		});

		for (int i = 0; i < 10; i++) {
			// i값 출력
			System.out.println(i);
			try {
				// JVM종료 요청
				System.exit(i);
			} catch (SecurityException e) {
				System.out.println("SecurityException : "+e.getMessage());
			}
		}

	}

}
