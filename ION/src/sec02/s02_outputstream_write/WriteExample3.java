package sec02.s02_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample3 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test-offset.txt");
		byte[] data = "ABCDEFG".getBytes();
		os.write(data, 2, 3);
		os.flush();
		os.close();
	}

}
