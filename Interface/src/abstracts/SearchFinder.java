/*
 * 추상 메소드인 lookup을 구현하지 않으면 추상 클래스로 만들어야 한다.
 * 그러므로 abstract class로 선언해야 한다.
 */
package abstracts;

public abstract class SearchFinder implements SearchFindable {
	
	@Override
	public void find(String f) {
		System.out.printf("SearchFinder : find(%s)\n",f);

	}

	@Override
	public void search(String s) {
		System.out.printf("SearchFinder : search(%s)\n",s);

	}
	
	// 추상 메소드인 lookup을 명시적으로 기술할 수 있다.
	// 기술하지 않아도 된다.
	// 그러나 구현 클래스에서는 구현을 해야 한다.
	@Override
	public abstract void lookup(String l); { //추상 메소드이기에 적용이 안된다
		//System.out.printf("SearchFinder : lookup(%s)\n",l);

	}


}
