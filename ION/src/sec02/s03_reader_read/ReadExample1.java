package sec02.s03_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample1 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test.txt");

		while (true) {
			int readData = reader.read();
			if (readData == -1)
				break;
			System.out.print((char) readData);
		}

		reader.close();

	}

}
