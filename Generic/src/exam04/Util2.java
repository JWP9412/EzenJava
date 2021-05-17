package exam04;

public class Util2 {
	Util2(){}
	public <T extends Pair> int getValue(Pair pair,String str) {
		return (int) pair.getValue();
		/*
		if(pair.getKey().equals(str)) {
			return pair.getValue();
		}else {
			return "일치하지 않습니다";
		}
		*/
	}
}
