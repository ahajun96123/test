package java07;

public class Ch6_19_Exercise_gs_main {

	public static void main(String[] args) {
		Ch6_19_Exercise_gs stu1 = new Ch6_19_Exercise_gs();
		Ch6_19_Exercise_gs stu2 = new Ch6_19_Exercise_gs();
		
		stu1.setName("선남");
		stu1.setAssignmentScore(91);
		stu1.setExamScore(84);
		stu2.setName("선녀");
		stu2.setAssignmentScore(86);
		stu2.setExamScore(95);
		
		System.out.println("이름 : "+stu1.getName());
		System.out.println("과제 점수 : "+stu1.getAssignmentScore());
		System.out.println("시험 점수 : "+stu1.getExamScore());
		System.out.println("학점 : "+stu1.getGrade());
		System.out.println();
		System.out.println("이름 : "+stu2.getName());
		System.out.println("과제 점수 : "+stu2.getAssignmentScore());
		System.out.println("시험 점수 : "+stu2.getExamScore());
		System.out.println("학점 : "+stu2.getGrade());
		System.out.println();

	}

}
