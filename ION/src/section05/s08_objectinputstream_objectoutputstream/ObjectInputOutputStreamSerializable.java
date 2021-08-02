package section05.s08_objectinputstream_objectoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStreamSerializable {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/Java/Object-a.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);		
		
		A a = new A();
		a.intA = 10;
		a.doubleA = 3.14;
		a.intArrA = new int[] {1, 2, 3};
		a.stringA = "Hong";
		
		
		oos.writeObject(a);
		
		oos.flush();	
		
		oos.close();	fos.close();
		
		FileInputStream fis = new FileInputStream("C:/Temp/Java/Object-a.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		a = (A)ois.readObject();
		Integer obj1 = (Integer) a.intA;
		Double obj2 = (Double) a.doubleA;
		int[] obj3 = (int[]) a.intArrA;
		String obj4 = (String) a.stringA;
		
		ois.close();	fis.close();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3[0] + "," + obj3[1] + "," + obj3[2]);
		System.out.println(obj4);
	}
}
