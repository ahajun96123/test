package java10;

public class Ch7_09_CarExample {

	public static void main(String[] args) {
		//Car 클래스 타입 변수 car 선언
		Ch7_09_Car car = new Ch7_09_Car();
		
		//부모클래스 타입의 변수 선언
		Ch7_09_Tire tire = new Ch7_09_Tire("aaa",10);
		//자식클래스 타입의 변수 선언
		Ch7_09_HankookTire hktire = Ch7_09_HankookTire("한국",10);
		
		tire = hktire;
		hktire = (Ch7_09_HankookTire)tire;
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HnakookTire로 교체");
				car.frontLeftTire = new Ch7_09_HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.frontRightTire = new Ch7_09_KumhoTire("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HnakookTire로 교체");
				car.backLeftTire = new Ch7_09_HankookTire("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤오른쪽 KumhoTire로 교체");
				car.backRightTire = new Ch7_09_KumhoTire("뒤오른쪽", 17);
				break;
			}
			System.out.println("-----------------------------------");
		}

	}

}
