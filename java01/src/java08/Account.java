package java08;

public class Account {
	private int balance;	//음수아니게 설정 & <=100만 private
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance<=MAX_BALANCE && balance>=MIN_BALANCE)
			this.balance = balance;
		else
			return;
	}
	

}
