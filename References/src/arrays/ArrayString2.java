package arrays;
/*
 * �迭(String)
 */
public class ArrayString2 {

	public static void main(String[] args) {
			String[] str =  null;
			
			if(str == null) {
				str = new String[]{ "ȫ�浿", "�̼���", "������", "������ ������" };
			}
			
			System.out.println("str length:" + str.length);
			
			for(int cnt=0; cnt < str.length; cnt++) {
				System.out.printf("[%d][%s]\n", cnt, str[cnt]);
			}
	}
}