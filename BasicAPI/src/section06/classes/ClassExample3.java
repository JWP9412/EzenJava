package section06.classes;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * 클래스 정보(메타클래스)
 * Class
 *  - 클래스의 이름,생성자 정보, 필드 정보, 메소드 정보
 */

public class ClassExample3 {

	public static void main(String[] args) {

		try {
			Class<?> clazz = Class.forName("section03.deepclone.Car");
			
			
			System.out.println("class name : " +clazz.getName());
			
			System.out.println("[생성자 정보]");
			Constructor<?>[] constructors = clazz.getDeclaredConstructors();
			for (Constructor<?> constructor : constructors) {
				System.out.println("Constructor : " + constructor.getName());
				Class[] parameters = constructor.getParameterTypes();
				printParameters(parameters);
			}
				System.out.println("[필드정보]");
				Field[] fields = clazz.getDeclaredFields();
				for(Field field : fields) {
					System.out.println(field.getType().getSimpleName() + " "
							+ field.getName());
			}
			System.out.println("[메소드 정보]");
			Method[] methods = clazz.getDeclaredMethods();
			for(Method method : methods) {
				System.out.print(method.getName()+"(");
				Class<?>[] parameters1 = method.getParameterTypes()	;
				printParameters(parameters1);
				System.out.println(")");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	private static void printParameters(Class<?>[] parameters) {
		System.out.println("parameters : length = "+parameters.length);
		for (int i = 0; i < parameters.length; i++) {
			System.out.print(parameters[i].getName());
			if (i < (parameters.length - 1)) {
				System.out.print(",");
			}
		}

	}

}
