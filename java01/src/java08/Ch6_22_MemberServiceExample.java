package java08;

import java.util.Scanner;
public class Ch6_22_MemberServiceExample {

	public static void main(String[] args) {
		Ch6_22_MemberService memberService = new Ch6_22_MemberService();
		Scanner sc = new Scanner(System.in);
		
		int a;
		String id = null;
		String pw;
		
		for(;;) {
			System.out.println("--------------------");
			System.out.println("수행할 서비스를 선택해 주세요.");
			System.out.println("1.로그인 || 2.로그아웃");
			System.out.print(">> ");
			a = sc.nextInt();
			switch (a) {
			case 1: {
				System.out.print("아이디를 입력하세요 : ");
				id = sc.next();
				System.out.print("비밀번호를 입력하세요 : ");
				pw = sc.next();
				boolean result = memberService.login(id, pw);
				if(result) {
					System.out.println(id+"님 로그인 되었습니다.");
				}else {
					System.out.println("id 또는 password가 올바르지 않습니다.");
					continue;
				}break;
			}
			case 2: {
				memberService.logout(id);
			}
			}
		}
		

	}

}
