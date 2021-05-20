package section04;
/*
 * [Ŭ������ ��� ���]
 * 	- ���ٽĿ��� this�� ���������� �����Ǵ� �͸� ��ü�� ������ �ƴ϶�
 * 		���ٽ��� ������ ��ü�� �����̴�.
 * 	- �ǰ�: �ܺ� Ŭ������ ����� �ʵ�� ������ �ʵ带 ���ٽĿ��� �������� �ʴ� ���� ����.
 */
public class UsingThis {
	public int outterField = 10;
	
	void add(int a) {
		this.outterField += a;
		System.out.printf("UsingThis.add(%d), outterField(%d)\n",a,this.outterField);
	}
	
	class Inner{
		int innerField =20;
		
		void method() {
			//���ٽ�
			MyFunctionalInterface fi =()->	{
				int outterField = 99;
				int innerField = 77;
				System.out.println("outterField : "+outterField); // ���ٽĿ� ����� �ʵ带 ����
				System.out.println("outterField UsingThis.this.outterField: "+UsingThis.this.outterField + "\n");// �ٱ� ��ü�� ������ ��� ���ؼ��� Ŭ������.this.�ʵ带 ���
				
				// ���ٽĿ� ����� �ʵ带 �������� ���Ѵ�. (������� ���� ������ �ν�)
				//System.out.println("outterField this.outterField: "+this.outterField + "\n"); 
				
				System.out.println("innerField : "+ innerField); // ���ٽĿ� ����� �ʵ带 ����
				System.out.println("innerField this.innerField: "+ this.innerField+"\n");//���ٽ� ���ο��� this.�� Inner ��ü�� ����
			};
			fi.method();
		}
	}
}
