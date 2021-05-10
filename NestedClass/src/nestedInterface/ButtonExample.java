package nestedInterface;

public class ButtonExample {
	
	public static void main(String[] args) {
		Button btn = new Button();
		
		new Button().setOnClickListener(new CallListener());
		
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
		System.out.println();
		
		CallListener listener = new CallListener();
		listener.onClick();
	}

}
