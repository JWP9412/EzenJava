package balance;

//사용자 정의 예외 발생시키기
public class AccountExample2 {

	public static void main(String[] args) {
		Account account = new Account();
		// 예금하기
		account.deposit(10000);
		System.out.println("예금액 : " + account.getBalance());

		// 출금하기
		try {
			account.withdraw(30000);
		} catch (BalanceInsufficientException e) {
			e.balanceAccount("잔고 오류");
		}
		System.out.println("처리 완료");
	}

}
