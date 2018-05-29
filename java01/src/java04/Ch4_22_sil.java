package java04;

import java.util.Scanner;
public class Ch4_22_sil {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("계설할 계좌에 돈을 넣어 주세요 : ");
		int account = sc.nextInt();
		int i;
		int a;
		for(;;) {
			System.out.println("--------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------");
			System.out.print("선택> ");
			i= sc.nextInt();
			switch(i){
			case 1: {System.out.print("예금액> ");
					 a = sc.nextInt();
					 account+=a;
					 System.out.println("현재 잔액은 "+account+"입니다.");
			break;}
			case 2: {System.out.print("출금액> ");
					 a = sc.nextInt();
					 if(a>account) {
						 System.out.println("잔고가 부족합니다.");
					 }else {account-=a;}
					 System.out.println("현재 잔액은 "+account+"입니다.");
			break;}
			case 3: {System.out.print("잔고> ");
					 System.out.println("현재잔액은 "+account+"입니다.");
			break;}
			case 4: System.out.print("업무를 종료합니다.");break;
			}
			if(i==4)break;
		}

	}

}
