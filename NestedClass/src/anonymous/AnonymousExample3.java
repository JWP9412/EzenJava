package anonymous;

public class AnonymousExample3 {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		Person ps = new Person()	{
			void run() {
				System.out.println("달려가");
			}
			
			@Override
			void wake() {
				System.out.println("5시에 기상");
				run();
			}
		};
		
		anony.field.wake();
		
		anony.method1();
		anony.method2(ps);
		anony.method2(new Person()	{
			int km = 42;
			void run() {
				System.out.println("(" +km + ")km 뛴다");
			}
			
			@Override
			void wake() {
				System.out.println("4시에 기상");
				run();
			}
		});
		/*
		anony.method2(
				new Person() {
					void study() {
						System.out.println("공부");
					}
					@Override
					void wake() {
						System.out.println("8시에 기상");
						study();
					}
				});
				*/

	}

}
