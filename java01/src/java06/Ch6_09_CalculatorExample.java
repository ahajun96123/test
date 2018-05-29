package java06;

import java.util.Scanner;
public class Ch6_09_CalculatorExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ch6_09_Calculator size = new Ch6_09_Calculator();
		
		System.out.println("정사각형의 넓이를 구하려면 한 면의 길이와 0을 입력하고 직사각형의 넓이를 구하려면 두 면의 길이를 입력하시오.");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		if(b==0) {
			double x = size.areaRectangle(a);
			System.out.println("정사각형의 넓이는 : "+x+"입니다.");
		}
		else {
			double y = size.areaRectangle(a, b);
			System.out.println("직사각형의 넓이는 : "+y+"입니다.");
		}
		

	}

}
