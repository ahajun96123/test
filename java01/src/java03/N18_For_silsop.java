package java03;

import java.util.Scanner;
public class N18_For_silsop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int sum=0;
		for(int a=1; a<=i; a++) {
			if( !((a%3==0)||(a%2==0)) ) {
				sum+=a;
			}
		}
		System.out.println("1부터 "+i+"까지 2또는 3의 배수가 아닌 수의 총 합은 "+sum);

	}

}
