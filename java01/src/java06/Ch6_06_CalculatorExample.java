package java06;

import java.util.Scanner;
public class Ch6_06_CalculatorExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Calculator 객체 생성
		//PowerOn 메소드 호출
		//plus 메소드 호출(매개 값은 알아서..) 및 호출 결과 출력
		//divide 메소드 호출(매개 값은 알아서..) 및 호출 결과 출력
		//powerOff 메소드 호출
		Ch6_06_Calculator a = new Ch6_06_Calculator();
		/*int x = sc.nextInt();
		int y = sc.nextInt();*/
		int b = a.plus(sc.nextInt(), sc.nextInt());
		a.PowerOn();
		System.out.println(b);
		System.out.println(a.divide(9, 4));
		a.powerOff();

	}

}
