package fileContorl;
/*
 * Java 7
 * try - with -resources
 * try�� ����� �Ǹ� �ڵ����� ���ҽ��� ����
 * interface AutoCloseale�� ���� ��ü ����
 */
public class TryWithResourceExample {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {fis = new FileInputStream("file.txt");
			fis.read();
			throw new Exception();

		} catch (Exception e) {
			System.out.println("���� ó�� �ڵ尡 ����Ǿ����ϴ�");
		} finally {
			if (fis != null) {// Java 6 ����
				//fis.close();
				try {
					fis.close();
				} catch (Exception e) {
				}

			}
		}
		System.out.println("����ó�� �Ϸ�");
	}
}
