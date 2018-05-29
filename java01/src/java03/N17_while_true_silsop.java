package java03;

import java.util.Scanner;
public class N17_while_true_silsop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요.");
		int i=0;	//갯수
		int sum=0;
		while(true) {
			int a = sc.nextInt();
			sum+=a;
			if(a==0)break;
			i++;
		}
		double avg=sum/i;	//평균
		System.out.println("수의 개수는 "+i+"개이며 평균은 "+avg+"입니다.");

	}

}
