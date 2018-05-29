package java08;

import java.util.Scanner;
public class Ch6_25_BankApplication {
	private static Ch6_25_Account[] accountArray = new Ch6_25_Account[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = sc.nextInt();
			
			if(selectNo ==1) {
				createAccount();
			} else if(selectNo ==2) {
				accountList();
			} else if(selectNo ==3) {
				deposit();
			} else if(selectNo ==4) {
				withdraw();
			} else if(selectNo ==5) {
				run = false;
			} else {System.out.println("1~5번 사이를 입력하세요.");}
		}
		System.out.println("프로그램 종료");

	}
	//계좌 생성하기
	private static void createAccount() {
		System.out.println("----------");
		System.out.println("계좌생성");
		System.out.println("----------");
		
		boolean b = true;
		String ano = null;
		while(b) {
			System.out.print("계좌번호 : ");
		
			ano = sc.next();
			//사용중인 계좌번호라면 "중복된 계좌번호입니다. 다시 입력해주세요."를 출력하도록 코딩 다시할것.			완성/
			Ch6_25_Account a = findAccount(ano);
			if(a == null)b=false;
			else {
			System.out.println("중복된 계좌번호입니다. 다시 입력해주세요.");
			}
		}
		
		
		System.out.print("계좌주 : ");
		String owner = sc.next();
		System.out.print("초기입금액 : ");
		int balance = sc.nextInt();
		Ch6_25_Account k1 = new Ch6_25_Account(ano, owner, balance);
		for(int i=0; i<100; i++) {
			if(accountArray[i] == null) {
				accountArray[i]= k1;break;}
		}
		System.out.println("결과 : 계좌가 생성되었습니다.");
		
	}
	
	//계좌목록보기
	private static void accountList() {
		System.out.println("----------");
		System.out.println("계좌목록");
		System.out.println("----------");
		for(int i=0; i<100; i++) {
			System.out.println(accountArray[i].getAno() +"	\t"+ accountArray[i].getOwner() +"	\t"+ accountArray[i].getBalance());
			if(accountArray[i+1] == null)break;
		}
	}
	
	//예금하기
	private static void deposit() {
		System.out.println("----------");
		System.out.println("예금");
		System.out.println("----------");
		System.out.print("계좌번호 : ");
		
		String ano = sc.next();
		Ch6_25_Account fa = findAccount(ano);
		if(fa == null) {System.out.println("error) 일치하는 계좌번호가 없습니다.");return;}
		
		System.out.print("예금액 : ");
		int bal = sc.nextInt();
		
		int a = fa.getBalance()+bal;
		fa.setBalance(a);
		
		System.out.println("결과 : 예금이 성공되었습니다.");
	}
	
	//출금하기
	private static void withdraw() {
		System.out.println("----------");
		System.out.println("출금");
		System.out.println("----------");
		System.out.print("계좌번호 : ");
		
		String ano = sc.next();
		Ch6_25_Account fa = findAccount(ano);
		if(fa == null) {System.out.println("error) 일치하는 계좌번호가 없습니다.");return;}
		
		System.out.print("출금액 : ");
		int bal = sc.nextInt();
		
		if(fa.getBalance()-bal<0) {
			System.out.println("error) 출금액이 잔액보다 큽니다.");
		}
		else {int a = fa.getBalance()-bal;
		fa.setBalance(a);
		System.out.println("결과 : 출금이 성공되었습니다.");
		}
		
	}
	
	//Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Ch6_25_Account findAccount(String ano) {
		int i;
		for(i=0; i<100; i++) {
			Ch6_25_Account a = accountArray[i];
			if(a == null)return null;
			else if(a.getAno().equals(ano))
				return accountArray[i];
		}
		return null;
		
	}

}
