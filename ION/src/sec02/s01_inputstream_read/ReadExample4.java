package sec02.s01_inputstream_read;

/*
 * [����]
 * 	- �迭�� ũ�� 1024byte�� ����� 4����Ʈ ������ �о ����
 * 	- ����� �迭�� ����ؼ� ���� ������ ���������� Ȯ��
 */
import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample4 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		byte[] readBytes = new byte[100];
		int offset = 0;
		int readlen = 4;
		int bufflen = readBytes.length;
		

		while ((offset + readlen) <= bufflen) {
			int readByteNo = is.read(readBytes, offset, readlen);
			if (readByteNo < 0) {
				break;
			}
			offset += readByteNo;
		}

		is.close();

		String strRead = new String(readBytes);
		System.out.printf(">strRead: offset(%d) strlen(%d)\n",offset,strRead.length());
		System.out.printf(strRead);
	}
}
