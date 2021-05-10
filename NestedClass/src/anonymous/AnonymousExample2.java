package anonymous;

public class AnonymousExample2 {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		Person ps = new Person()	{
			void run() {
				System.out.println("�޷���");
			}
			
			@Override
			void wake() {
				System.out.println("5�ÿ� ���");
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
				System.out.println("���� ("+cnt+"/" +km + ")km �� �޸��� �ֽ��ϴ�");
				}
			}
			
			@Override
			void wake() {
				System.out.println("4�ÿ� ���");
				run(42);
			}
		});
		/*
		anony.method2(
				new Person() {
					void study() {
						System.out.println("����");
					}
					@Override
					void wake() {
						System.out.println("8�ÿ� ���");
						study();
					}
				});
				*/

	}

}
