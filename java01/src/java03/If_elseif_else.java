package java03;

import java.util.Scanner;
public class If_elseif_else {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.println("점수를 입력하세요(0~100)");
			int score = sc.nextInt();
			if (score<0 || score>100) {
				System.out.println("0~100의 숫자를 기입하세요.");continue;
			}
			if(score>=90) {
				System.out.println("점수가 90~100 입니다.");
				System.out.println("등급은 A입니다.");
			}
			else if(score<90 && score>=80) {
				System.out.println("점수가 80~89 입니다.");
				System.out.println("등급은 B입니다.");
			}
			else if(score<80 && score>=70) {
				System.out.println("점수가 70~79 입니다.");
				System.out.println("등급은 C입니다.");
			}
			else if(score<70 && score>=60) {
				System.out.println("점수가 60~69 입니다.");
				System.out.println("등급은 D입니다.");
			}
			else {
				System.out.println("점수가 60 미만입니다.");
				System.out.println("재수강 ㄱㄱㄱㄱㄱㄱFFFFFFF");
			}break;
		}

	}

}
