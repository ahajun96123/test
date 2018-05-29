package java10;

public class Ch7_09_Car {
	//필드
	//각 필드는 Tire 클래스 타입으로 선언됨.
	Ch7_09_Tire frontLeftTire = new Ch7_09_Tire("앞왼쪽", 6);
	Ch7_09_Tire frontRightTire = new Ch7_09_Tire("앞오른쪽", 2);
	Ch7_09_Tire backLeftTire = new Ch7_09_Tire("뒤왼쪽", 3);
	Ch7_09_Tire backRightTire = new Ch7_09_Tire("뒤오른쪽", 4);
	//위의 내용을 배열로
	//Tire 클래스 타입의 배열 변수를 선언해서 우변에 있는 내용을 각각 배열 변수에 대입
	Ch7_09_Tire[] tire = new Ch7_09_Tire[4];
	Ch7_09_Tire[] tire1 = {};
	Ch7_09_Tire[] tire2 = {
			new Ch7_09_Tire("앞왼쪽", 6),
			new Ch7_09_Tire("앞오른쪽", 2),
			new Ch7_09_Tire("뒤왼쪽", 3),
			new Ch7_09_Tire("뒤오른쪽", 4)
	};
	
	
	//생성자
	//메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll()==false) { stop(); return 1;}
		if(frontRightTire.roll()==false) { stop(); return 2;}
		if(backLeftTire.roll()==false) { stop(); return 3;}
		if(backRightTire.roll()==false) { stop(); return 4;}
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}

}
