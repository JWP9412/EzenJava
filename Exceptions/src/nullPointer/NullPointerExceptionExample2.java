package nullPointer;

public class NullPointerExceptionExample2 {

	public static void main(String[] args) {
		String data = null;
		if (data == null) {
			System.out.println("data is null");
			System.out.println(data);// ���ο��� nullüũ�� �ؼ� ����� �߱� ������ ������ ������ ����

		}
		String nullstring = (data == null) ? "<null>" : data.toString();
		System.out.println(data.toString());
	}
}
