package java05;

import java.util.Scanner;
public class Ch5_13_Arraysilsop {

	public static void main(String[] args) {
		String[][] words = {
				{"chair","의자"},
				{"desk","책상"},
				{"water","물"},
				{"monitor","모니터"},
				{"mouse","마우스"}
		};
		Scanner sc = new Scanner(System.in);
		int O=0;
		double per;
		String in;
		for(int i=0; i<words.length; i++) {
			System.out.print("문제"+(i+1)+".  "+words[i][0]+"의 뜻은 무엇인가요?  ");
			in = sc.next();
			if(in.equals(words[i][1])) {
				O++;
				System.out.println("정답입니다.");
			}else {
				System.out.println("틀렸습니다.");
			}
		}
		per = (double)O/words.length*100;
		System.out.println("총 "+O+"개를 맞췄습니다.");
		System.out.println("정답률은 "+per+"% 입니다.");

	}

}
