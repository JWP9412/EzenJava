package windows;

public class Window2 {
	Button button1 = new Button();
	Button button2 = new Button();
	Button button3 = new Button();
	
	/*
	 * �ν��Ͻ� ��� Ŭ����
	 */
	class ButtonClickListener implements Button.OnClickListener {
		
		@Override
		public void onClick() {
			System.out.println("��ư�� Ŭ���Ǿ����ϴ�.");
		}
	};
	
	Window2(){
		button3.setOnClickListener(new ButtonClickListener());
		button1.setOnClickListener(new ButtonClickListener());
		button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("�޽����� �����ϴ�");
			}
		});
	}
}
