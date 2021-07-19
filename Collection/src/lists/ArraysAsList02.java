package lists;
/*
 * ������ ��ü�� ����Ʈ �迭�� ó��
 * ����Ʈ�� �ڷḦ �߰��� �� ����. 
 */


/*
 * @SafeVarargs
    @SuppressWarnings("varargs")
    public static <T> List<T> asList(T... a) {
        return new ArrayList<>(a);
    }
 */


import java.util.Arrays;
import java.util.List;


public class ArraysAsList02 {

	public static void main(String[] args) {
		List<String> listLangs = Arrays.asList("1.�ڹ�","2.�ڹٽ�ũ��Ʈ","3.���̽�");
//		List<String> listLangs = Arrays.<String>asList("1.�ڹ�","2.�ڹٽ�ũ��Ʈ","3.���̽�");
		for(String lang : listLangs) {
			System.out.println(lang);
		}
		
		// ���� �߰��ϰų� ���� �� �� ����.
		// java.lang.UnsupportedOperationException
		// listLangs.add("����Ʈ");
		// listLangs.remove("3.���̽�");
		
		
		
		// ��ü�� ������ �� �ִ�.
		listLangs.set(0, "1.Java");
		for(String lang : listLangs) {
			System.out.println(lang);
		}
	}

}
