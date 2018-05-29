package java07;

public class Ch6_19_Exercise_gs {
	
	private String name;
	private int assignmentScore;
	private int examScore;
	private char grade;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAssignmentScore() {
		return assignmentScore;
	}
	public void setAssignmentScore(int assignmentScore) {
		this.assignmentScore = assignmentScore;
	}
	public int getExamScore() {
		return examScore;
	}
	public void setExamScore(int examScore) {
		this.examScore = examScore;
	}
	public char getGrade() {
		double avg = (this.assignmentScore+this.examScore)/2;
		if(avg>=90)grade='A';
		else if(avg>=80)grade='B';
		else grade='F';
		return grade;
	}

}
