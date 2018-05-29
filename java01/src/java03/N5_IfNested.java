package java03;
//중첩 if 문
import java.util.Scanner;
public class N5_IfNested {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		String g;
		if(i>=90) {
			if(i>=95) {g="A+";}
			else {g="A";}
		}
		else if(i>=80 && i<90) {
			if(i>=85) {g="B+";}
			else {g="B";}
		}
		else if(i>=70 && i<80) {
			if(i>=75) {g="C+";}
			else {g="C";}
		}
		else if(i>=60 && i<70) {
			if(i>=65) {g="D+";}
			else {g="D";}
		}
		else {
			g="F";
		}
		System.out.println("점수는 "+i+"입니다.");
		System.out.println("학점은 "+g+"입니다.");

	}

}
