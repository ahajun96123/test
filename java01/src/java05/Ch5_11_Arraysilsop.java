package java05;

import java.util.Scanner;
public class Ch5_11_Arraysilsop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] coin = {500,100,50,10};
		
		System.out.println("금액을 입력해 주세요.");
		int change=sc.nextInt();
		
		for(int i=0; i<coin.length; i++) {
			int coinC=change/coin[i];
			System.out.println(coin[i]+"원 동정 : "+coinC+"개");
			
			change=change%coin[i];
		}

	}

}
