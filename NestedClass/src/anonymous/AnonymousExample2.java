package anonymous;

public class AnonymousExample2 {

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

			void run(int km) {
				this.km =km;
				for(int cnt =0; cnt<= this.km; cnt++) {
				System.out.println("현재 ("+cnt+"/" +km + ")km 를 달리고 있습니다");
				}
			}
			
			@Override
			void wake() {
				System.out.println("4시에 기상");
				run(42);
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
