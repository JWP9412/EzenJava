/*
 * �߻� �޼ҵ��� lookup�� �������� ������ �߻� Ŭ������ ������ �Ѵ�.
 * �׷��Ƿ� abstract class�� �����ؾ� �Ѵ�.
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
	
	// �߻� �޼ҵ��� lookup�� ��������� ����� �� �ִ�.
	// ������� �ʾƵ� �ȴ�.
	// �׷��� ���� Ŭ���������� ������ �ؾ� �Ѵ�.
	@Override
	public abstract void lookup(String l); { //�߻� �޼ҵ��̱⿡ ������ �ȵȴ�
		//System.out.printf("SearchFinder : lookup(%s)\n",l);

	}


}
