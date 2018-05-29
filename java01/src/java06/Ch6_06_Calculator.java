package java06;

//mothod 연습 예제 p.217
public class Ch6_06_Calculator {
	//method 선언
	//메소드 이름 : PowerOn
	//메소드 타입 : void
	void PowerOn() {
		System.out.println("전원을 켭니다. ");
	}
	
	int plus(int x, int y) {
		int result = x+y;
		return result;		//return하는 타입형과 메소드 타입형이 같아야 한다.
	}
	
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}

}
