package sec02.s02_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args)throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test-out2.txt");
		byte[] data = "Hello, Java!".getBytes();
		os.write(data);
		os.flush();
		os.close();
	}

}
