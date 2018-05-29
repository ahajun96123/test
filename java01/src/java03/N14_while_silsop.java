package java03;

import java.util.Scanner;
public class N14_while_silsop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		String a;
		do {
			System.out.print(">");
			String m = sc.next();
			a=m;
			System.out.println(m);
		}
		while(!a.equals("q"));
		System.out.println();
		System.out.println("프로그램 종료");

	}

}
