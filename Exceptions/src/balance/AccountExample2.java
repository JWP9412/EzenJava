package balance;

//����� ���� ���� �߻���Ű��
public class AccountExample2 {

	public static void main(String[] args) {
		Account account = new Account();
		// �����ϱ�
		account.deposit(10000);
		System.out.println("���ݾ� : " + account.getBalance());

		// ����ϱ�
		try {
			account.withdraw(30000);
		} catch (BalanceInsufficientException e) {
			e.balanceAccount("�ܰ� ����");
		}
		System.out.println("ó�� �Ϸ�");
	}

}
