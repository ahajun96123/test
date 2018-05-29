package java08;

import java.util.Scanner;
public class Ch6_23_AbsValueExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Ch6_23_AbsValue abs = new Ch6_23_AbsValue();
		
		int i;
		double[] x = new double[2];
		double[] y = new double[2];
		
		for(;;) {
			System.out.println("--------------------------");
			System.out.println("수행할 내용을 선택하세요.");
			System.out.println("1. 두점 사이의 거리 구하기");
			System.out.println("2. 절대값 구하기");
			System.out.print("선택>> ");
			i = sc.nextInt();
			
			switch(i) {
			case 1:{
				System.out.println("두 점을 (x,y)순으로 입력해 주세요.");
				System.out.print("첫번째 x좌표");
				x[0] = sc.nextDouble();
				System.out.print("첫번째 y좌표");
				y[0] = sc.nextDouble();
				System.out.print("두번째 x좌표");
				x[1] = sc.nextDouble();
				System.out.print("두번째 y좌표");
				y[1] = sc.nextDouble();
				double len = Math.sqrt((x[0]-x[1])*(x[0]-x[1]) + (y[0]-y[1])*(y[0]-y[1]));
				System.out.println("두 점 사이의 거리는 "+len);
			}break;
			case 2:{
				System.out.println("정수를 입력해주세요.");
				int j = sc.nextInt();
				if(j<0)j=-j;
				System.out.println("입력하신 정수의 절대값은 "+j+"입니다.");
			}break;
			}
		}
	}

}
