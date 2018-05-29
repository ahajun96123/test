package java07;

public class Ch6_20_account {
	
	private String ownerName;
	private int accountNumber, balance;
	
	void deposit(int a) {
		this.balance +=a;
	}
	void withdraw(int a) {
		this.balance -=a;
	}
	void result() {
		System.out.println("예금주 이름 : "+getOwnerName());
		System.out.println("계좌번호 : "+getAccountNumber());
		System.out.println("잔고 : "+getBalance());
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

}
