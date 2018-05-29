package java07;

public class Ch6_20_accountMain {

	public static void main(String[] args) {
		Ch6_20_account acc = new Ch6_20_account();
		
		acc.setOwnerName("홍길동");
		
		acc.setAccountNumber(101);
		
		acc.setBalance(10000);
		
		acc.deposit(3000);
		
		acc.withdraw(5000);
		
		acc.result();

	}

}
