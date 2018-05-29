package java04;

import java.util.Scanner;
public class Ch4_21_sil {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		int count=1;
		int answer = (int)(Math.random()*100+1);
		for(;;) {
			System.out.print("1과 100 사이의 값을 입력하세요 : ");
			input = sc.nextInt();
			if(input<answer) {
				System.out.println("더 큰 수를 입력하세요.");
			}
			else if(input>answer) {
				System.out.println("더 작은 수를 입력하세요.");
			}
			else {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 "+count+"번입니다.");
				break;
			}count++;
		}

	}

}
