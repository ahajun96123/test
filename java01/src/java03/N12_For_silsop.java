package java03;

import java.util.Scanner;
public class N12_For_silsop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("더하고 싶은 시작과 끝 숫자를 입력하세요 : ");
		int startnum = sc.nextInt();
		int endnum = sc.nextInt();
		//int num=10;
		int sum=0;
		for(int i=startnum; i<=endnum; i++) {
			sum+=i;
			if(i==endnum) {
				System.out.print(i+"="+sum);
			}
			else {
			System.out.print(i+"+");}
		}

	}

}
