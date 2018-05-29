package java02;

import java.util.Scanner;

public class 스캐너실습 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름, 도시, 나이, 체중을 빈칸으로 분리하여 입력하세요");
		String name = scan.next();
		String city = scan.next();
		int age = scan.nextInt();
		double weight = scan.nextDouble();
		System.out.println("당신의 이름은 "+name+"입니다.");
		System.out.println("당신이 사는 도시는 "+city+"입니다.");
		System.out.println("당신의 나이는 "+age+"살 입니다.");
		System.out.println("당신의 체중은 "+weight+"kg입니다.");
		

	}

}
