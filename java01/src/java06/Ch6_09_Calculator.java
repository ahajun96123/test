package java06;

//method overloading p.232
public class Ch6_09_Calculator {
	//정사각형의 넓이를 구하는 메소드
	//메소드 이름 : areaRectangle
	
	double width;
	double height;
	
	double areaRectangle(double width) {
		this.width = width;
		double area = width*width;
		return area;
	}
	
	//직사각형의 넓이를 구하는 메소드
	double areaRectangle(double width, double height) {
		double area = width*height;
		return area;
	}

}




//main 클래스의 실행 내용
/*
 * 객체 생성해서 
 * 정사각형 넓이 구하는 메소드 호출하고 결과 출력
 * 직사각형 넓이 구하는 메소드 호출하고 결과 출력
 */