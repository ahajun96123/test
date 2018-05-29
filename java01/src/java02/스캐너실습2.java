package java02;

import java.util.Scanner;

public class 스캐너실습2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("초를 입력하세요 : ");
		int time = scan.nextInt();
		int hour;
		int min;
		int sec;
		hour = time/3600;
		min = (time%3600)/60;
		sec = (time%3600)%60;
		
		
		System.out.print(time+"초는 "+hour+"시간 "+min+"분 "+sec+"초 입니다.");

	}

}
