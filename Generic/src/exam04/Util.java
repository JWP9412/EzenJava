package exam04;

public class Util {
	Util(){}
	public static <T extends Pair> Integer getValue(Pair pair,String str) {
		//return (int) pair.getValue();
		if(pair.getKey().equals(str)) {
			return (int) pair.getValue();
		}else {
			return null;
		}
		
	}
	public static <T extends ChildPair> Integer getValue(ChildPair childPair,String str) {
		//return (int) childPair.getValue();
		
		if(childPair.getKey().equals(str)) {
			return (int) childPair.getValue();
		}else {
			return null;
		}
	}
}
