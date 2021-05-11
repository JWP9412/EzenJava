package balance;

//����� ���� ���� �߻���Ű��
public class Account {
	private long balance;
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) throws BalanceInsufficientException{
		if(balance < money) {
			String msg = String.format("�ܰ���� : %d�� ���ڶ�~!", (money-balance));
			BalanceInsufficientException exception = new BalanceInsufficientException(this,msg);
			exception.setBalance(this);
			throw exception;
			//throw new BalanceInsufficientException("�ܰ���� : " +(money-balance)+"�� ���ڶ�");
			//throw new BalanceInsufficientException(msg);
		}
		this.balance -= money;
	}
}
