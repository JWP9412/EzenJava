package exam05;

public class ActionExample {

	public static void main(String[] args) {
		Action action = new Action() { // 익명 구현 예제
			@Override
			public void work() {
				System.out.println("copy");
			}
			
			@Override
			public void sleep() {
				System.out.println("zz2");
			}
		};

		action.work();
		action.sleep();

	}

}
