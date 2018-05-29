package java05;

import java.util.Scanner;
public class Ch5_16_array__sil {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int[] score = null;
		int k;
		double sum=0, avg=0;
		int max=0;
		for(;;) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택> ");
			int i = sc.nextInt();
			switch(i) {
			case 1: {
				System.out.print("학생수> ");
				num = sc.nextInt();
				score = new int[num];
				break;
			}
			case 2: {
				for(k=0; k<num; k++){
					System.out.print((k+1)+"번째 학생 점수 : ");
					score[k] = sc.nextInt();
					sum+=score[k];
					avg=sum/num;
					if(max<score[k])max=score[k];
				}break;
			}
			case 3: {
				for(k=0; k<num; k++) {
					System.out.println((k+1)+"번째 학생 점수 : "+score[k]);
				}break;
			}
			case 4: {
				System.out.println("최고 점수: "+max);
				System.out.println("평균 점수: "+avg);break;
			}
			case 5: {
				System.out.println("종료합니다.");break;
			}
			}
			if(i==5)break;
		}

	}

}
