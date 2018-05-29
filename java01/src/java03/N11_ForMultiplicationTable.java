package java03;
import java.util.Scanner;
public class N11_ForMultiplicationTable {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=1; i<10; i++) {
			System.out.println(i+" * "+a+" = "+i*a);
		}*/
		for(int i=1; i<10; i++) {
			for(int j=2; j<10; j++) {
				System.out.print(j+" * "+i+" = "+i*j+"     ");
				if(i*j<10)System.out.print(" ");
				if(j==9)System.out.println();
			}
		}

	}

}
