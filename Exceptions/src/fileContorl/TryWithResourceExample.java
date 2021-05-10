package fileContorl;
/*
 * Java 7
 * try - with -resources
 * try를 벗어나게 되면 자동으로 리소스를 해제
 * interface AutoCloseale의 구현 객체 정의
 */
public class TryWithResourceExample {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {fis = new FileInputStream("file.txt");
			fis.read();
			throw new Exception();

		} catch (Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다");
		} finally {
			if (fis != null) {// Java 6 까지
				//fis.close();
				try {
					fis.close();
				} catch (Exception e) {
				}

			}
		}
		System.out.println("파일처리 완료");
	}
}
