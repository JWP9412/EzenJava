package whilestmt;
/*
 * �ݺ���(while)
 *   - ���ǽ��� ���̸� ���� ��� ����
 *   - ���ǽ� : �񱳿����, �������
 */
public class WhileStatement1 {
	public static void main(String[] args) {
		int cnt = 0;
		
		while(++cnt <= 10) {
			System.out.println("1 cnt=" + cnt);
		}
		
		while(cnt > 1) {
			System.out.println("2 cnt=" + --cnt);
		}
	}
}
