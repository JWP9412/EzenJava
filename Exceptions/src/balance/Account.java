package balance;

//사용자 정의 예외 발생시키기
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
			String msg = String.format("잔고부족 : %d원 모자람~!", (money-balance));
			BalanceInsufficientException exception = new BalanceInsufficientException(this,msg);
			exception.setBalance(this);
			throw exception;
			//throw new BalanceInsufficientException("잔고부족 : " +(money-balance)+"원 모자람");
			//throw new BalanceInsufficientException(msg);
		}
		this.balance -= money;
	}
}
