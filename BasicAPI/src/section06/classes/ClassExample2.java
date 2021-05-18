package section06.classes;
/*
 * Ŭ���� ����(��ŸŬ����)
 * Class
 *  - Ŭ������ �̸�,������ ����, �ʵ� ����, �޼ҵ� ����
 */
import section03.deepclone.Car;

public class ClassExample2 {

	public static void main(String[] args) {
		Car car = new Car();
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println();
		
		Package pack = clazz1.getPackage();
		System.out.println("class packagename : "+pack.getName());
		
		try {
			Class clazz2 = Class.forName("section03.deepclone.Car");
			System.out.println(clazz1.getName());
			System.out.println(clazz1.getSimpleName());
			System.out.println(clazz1.getPackage().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
