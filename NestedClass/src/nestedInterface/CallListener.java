package nestedInterface;
/*
 * Button�� ����Ǿ� �ִ� ��ø�������̽��� OnClickListener��
 * ����Ͽ� ���� ��ü CallListener�� ����
 */
public class CallListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("CallListener.onClick()");
		
	}

}
