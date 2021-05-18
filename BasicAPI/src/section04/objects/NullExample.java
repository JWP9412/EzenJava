package section04.objects;
/*
 * Object.requireNonNull(T obj)
 * - null�� �ƴϸ� �Ķ���ͷ� ���޵� ���� ����
 * - null�̸� NullPointerException ���ܰ� �߻�
 * - null�̸� �⺻��(default)�� ������ ���� ����
 */
import java.util.Objects;

public class NullExample {

	public static void main(String[] args) {
		String str1 = "�����";
		String str2 = null;
		
		System.out.println("isNull(str1) : "+ Objects.isNull(str1)); //false
		System.out.println("isNull(str2) : "+ Objects.isNull(str2)); //true
		
		System.out.println("isNull(str1) : "+ Objects.nonNull(str1)); //true
		System.out.println("isNull(str2) : "+ Objects.nonNull(str2)); //false
		
		System.out.println(Objects.requireNonNull(str1));
		//System.out.println(Objects.requireNonNull(str2,"��"));
		try {
			String name = Objects.requireNonNull(str2);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println("str2 : "+Objects.requireNonNull(str2,"�⺻��"));
		}catch(NullPointerException e){
			System.out.println(e.getLocalizedMessage());
		}
		
		
		
		try {
			String name = Objects.requireNonNull(str2,"�̸��� �����ϴ�");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String name = Objects.requireNonNull(str2, ()->"�̸��� ���ٴϱ��");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
