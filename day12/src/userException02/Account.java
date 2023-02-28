package userException02;

public class Account {
	private int balance;  // 잔액 

	public int getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
		System.out.println("입금액 " + money + "원이 입금됨");
	}
	public void withdraw(int money) throws InSufficientException {
		if(balance < money) { // 돈이 더작으면 예외 호출 
			throw new InSufficientException("잔고 " + (money-balance) + "원 부족하여 출금할 수 없음"); //객체생성 
		}
		balance -= money;
	}	
//	public void withdraw(int money) {
//		if(balance < money) {
//			System.out.println("잔고 " + (money-balance) + "원 부족");
//			return;
//		}
//		balance -= money;
	
}


