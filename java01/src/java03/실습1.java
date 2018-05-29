package java03;
import java.util.Scanner;
public class 실습1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int g = sc.nextInt();
		if(s>=60) {
			if(g !=4)
				System.out.println("합격입니다.");
			else if(s>=70)
				System.out.println("합격입니다.");
			else System.out.println("불합격입니다.");
		}

	}

}
