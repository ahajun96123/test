package java02;

import java.util.Scanner;	//스캐너 옵션 추가했다고 생각

public class Ch3_ScannerExample {

	public static void main(String[] args) {
		/*
		 * next() : 문자열 입력
		 * nextInt() : 정수 입력
		 * nextDouble() : 실수 입력
		 * close() : 스캐너 종료
		 */
		
		Scanner scan = new Scanner(System.in);
		//현재 프로그램에서 scan이라는 이름으로 Scanner 기능을 사용하겠다는 의미
		System.out.print("이름을 입력해주세요 : ");
		String name = scan.next();
		System.out.println("당신의 이름은 "+name+"입니다.");
		
		scan.close();

	}

}
