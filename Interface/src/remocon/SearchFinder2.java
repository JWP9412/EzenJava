package remocon;

public class SearchFinder2 implements Finder, Searchable2 {
	
	@Override
	public void find(String text) {
		System.out.printf("SearchFindr2:find(%s)\n",text);

	}
	@Override
	public void search(String url) {
		System.out.printf("SearchFindr2:search(%s)\n",url);

	}

	

}
