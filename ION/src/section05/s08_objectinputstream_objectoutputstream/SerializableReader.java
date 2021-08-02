package section05.s08_objectinputstream_objectoutputstream;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableReader {
	static final String filename = "C:/Temp/Java/Object-classab.dat";
	
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream(filename);
		ObjectInputStream ois = new ObjectInputStream(fis);
		ClassA classA = (ClassA) ois.readObject();
		System.out.println("field1: " + classA.field1);
		System.out.println("classb.field1: " + classA.classb.field1);
		System.out.println("field3: " + classA.field3);
		System.out.println("field4: " + classA.field4);
	}
}
