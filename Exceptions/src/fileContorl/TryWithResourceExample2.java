package fileContorl;

public class TryWithResourceExample2 {
	public static void main(String[] args) {
		try (FileInputStream fis =new FileInputStream("file.txt") ){
			fis.read();
			throw new Exception();

		} catch (Exception e) {
			System.out.println("���� ó�� �ڵ尡 ����Ǿ����ϴ�");
		} 
		/*
		  finally {//�ʿ� ���� , �ڵ�����  fis.close()�� ȣ���
		 
			if (fis != null) {
				//fis.close();
				try {
					fis.close();
				} catch (Exception e) {
				}

			}
		}
		*/
		System.out.println("����ó�� �Ϸ�");
	}
}
