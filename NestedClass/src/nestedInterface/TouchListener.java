package nestedInterface;

public class TouchListener implements OnTouchListener {

	@Override
	public void onTouch(String msg) {
		System.out.printf("TouchListner.onClick(%s)\n",msg);

	}

}
