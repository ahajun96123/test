package java02;

import java.util.Scanner;
public class 연습장{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int i = sc.nextInt();
    	int[] score = new int[i];
    	int sum=0;
    	int max=0;
    	for(int a=0; a<i; a++) {
    		score[a] = sc.nextInt();
    		sum+=score[a];
    		if(max<score[a]) {
    			max=score[a];
    		}
    	}
    	double avg=100.0*sum/max/i;
    	System.out.println(avg);
    }
}