package java08;

import java.util.Scanner;
public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student stu1 = new Student(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		Student stu2 = new Student(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		Student stu3 = new Student(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		
		int[] s = {stu1.sum(),stu2.sum(),stu3.sum()};
		String[] u = {stu1.name,stu2.name,stu3.name};
		
		System.out.println(stu1.name+"의 평균은 "+stu1.avg()+"입니다.");
		System.out.println(stu2.name+"의 평균은 "+stu2.avg()+"입니다.");
		System.out.println(stu3.name+"의 평균은 "+stu3.avg()+"입니다.");
		
		for(int i=0; i<2; i++) {
			for(int j=i+1; j<3; j++) {
				if(s[j]>s[i]) {
					int m = s[i];
					s[i]=s[j];
					s[j]=m;
					String e = u[i];
					u[i]=u[j];
					u[j]=e;
				}
			}
		}//for(int i=0; i<3; i++)System.out.println(s[i]);
		
		for(int i=0; i<3; i++) {
			System.out.println(i+1+"등 : "+u[i]);
		}

	}

}
