package section05.s08_objectinputstream_objectoutputstream;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableWriter {
	static final String filename = "C:/Temp/Java/Object-classab.dat";
	
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream(filename);
		ObjectOutputStream oos = new ObjectOutputStream(fos);		
		ClassA classA = new ClassA();
		classA.field1 = 1;
		classA.classb.field1 = 2;
		classA.field3 = 3;
		classA.field4 = 4;
		
		oos.writeObject(classA);
		oos.flush();	
		oos.close(); fos.close();
		System.out.printf("클래스(ClassA)의 객체(classA)를 파일(%s)에 저장했습니다."
				,filename);
	}
}
