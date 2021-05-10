package fileContorl;

public class TryWithResourceExample2 {
	public static void main(String[] args) {
		try (FileInputStream fis =new FileInputStream("file.txt") ){
			fis.read();
			throw new Exception();

		} catch (Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다");
		} 
		/*
		  finally {//필요 없음 , 자동으로  fis.close()가 호출됨
		 
			if (fis != null) {
				//fis.close();
				try {
					fis.close();
				} catch (Exception e) {
				}

			}
		}
		*/
		System.out.println("파일처리 완료");
	}
}
