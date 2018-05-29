package java04;

import java.util.Scanner;
public class Ch5_08_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] i = new int[3];
		int sum=0;
		double avg;
		for(int k=0; k<3; k++) {
			i[k] = sc.nextInt();
			sum+=i[k];
		}
		avg = (double)sum/i.length;
		System.out.println("총 합 : "+sum+"  평균값 : "+avg);
		
	}

}
