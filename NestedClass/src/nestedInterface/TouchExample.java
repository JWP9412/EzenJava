package nestedInterface;

public class TouchExample {
	
	public static void main(String[] args) {
		Button btn = new Button();		
		
		btn.setOnTouchListener(new TouchListener());
		btn.touch();
		
	} 

}
