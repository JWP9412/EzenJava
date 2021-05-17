package section05;

/*
 * Generic
 * 제한된 타입 파라미터
 * 상위 클래스를 제한(Upper Bounded Wildcards)
 */
public class Util {
	public static <T extends Number> int compare(T t1, T t2) {
		// public static <T> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		// System.out.printf("v1(%b) v2(%b)\n",v1,v2);
		// System.out.printf("t1(%d) t2(%d)\n",t1,t2);
		return Double.compare(v1, v2);
	}

	public static <T extends String> boolean compare(T t1, T t2) {
		// public static <T> int compare(T t1, T t2) {
		String v1 = String.valueOf(t1);
		String v2 = String.valueOf(t2);
		// System.out.printf("v1(%b) v2(%b)\n",v1,v2);
		// System.out.printf("t1(%d) t2(%d)\n",t1,t2);
		return v1.equals(v2);
	}
}
