package java08;

public class Student {
	
	Student(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	String name;
	int kor,eng,math;
	
	double avg() {
		double avg = (double)sum()/3;
		return avg;
	}
	
	int sum() {
		int sum = kor+eng+math;
		return sum;
	}

}
