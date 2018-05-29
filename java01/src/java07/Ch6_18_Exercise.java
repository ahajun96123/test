package java07;

public class Ch6_18_Exercise {
	
	String name;
	int assignmentScore;
	int examScore;
	char grade;
	
	void result() {
		int a = (this.examScore+this.assignmentScore)/2;
		
		if(a>=90)grade='A';
		else if(a>=80)grade='B';
		else grade='c';
		
		System.out.println("이름 : "+this.name);
		System.out.println("과제 점수 : "+assignmentScore);
		System.out.println("시험 점수 : "+examScore);
		System.out.println("학점 : "+grade);
		System.out.println();
	}

}
