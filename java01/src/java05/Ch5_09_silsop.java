package java05;

import java.util.Scanner;
public class Ch5_09_silsop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 5개를 입력하세요.");
		int[] arr = new int[5];
		int temp;
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();}
		for(int i=0; i<arr.length; i++){
			for(int k=0; k<arr.length; k++) {
				if(arr[k]<arr[i]) {
					temp=arr[k];
					arr[k]=arr[i];
					arr[i]=temp;
				}
			}

		}
		for(int i=0; i<arr.length; i++)System.out.println(arr[i]);

	}
}
