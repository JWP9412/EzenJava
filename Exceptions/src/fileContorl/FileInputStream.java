package fileContorl;
/*
 * throws는 메소드를 호출한 곳에서 예외 처리를 하도록 지정
 */
public class FileInputStream implements AutoCloseable{
	private String filename;
	
	public FileInputStream(String filename) {
		this.filename = filename;
	}
	
	public void read() {
		System.out.println(filename + "을 읽습니다");
	}
	
	@Override
	//public void close(){
	public void close() throws Exception{
		System.out.println(filename + "을 닫습니다 $$$$");
		
	}
	
}
