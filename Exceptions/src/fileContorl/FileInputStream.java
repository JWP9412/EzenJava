package fileContorl;
/*
 * throws�� �޼ҵ带 ȣ���� ������ ���� ó���� �ϵ��� ����
 */
public class FileInputStream implements AutoCloseable{
	private String filename;
	
	public FileInputStream(String filename) {
		this.filename = filename;
	}
	
	public void read() {
		System.out.println(filename + "�� �н��ϴ�");
	}
	
	@Override
	//public void close(){
	public void close() throws Exception{
		System.out.println(filename + "�� �ݽ��ϴ� $$$$");
		
	}
	
}
