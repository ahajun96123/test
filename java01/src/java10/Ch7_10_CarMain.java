package java10;

public class Ch7_10_CarMain {

	public static void main(String[] args) {
		//각 클래스 형태의 변수 선언
		Ch7_10_Sedan sedan = new Ch7_10_Sedan("빨간색", 100);
		Ch7_10_Truck truck = new Ch7_10_Truck("검정색", 50);
		
		//필드설정
		//부모 클래스의 필드설정
		sedan.speedUp(100);
		truck.speedUp(50);
		//sedan.setColor("빨간색");
		//truck.setColor("검정색");
		//자식 클래스의 필드설정
		sedan.setSeat(5);
		truck.setCarry(5);
		
		//출력문
		System.out.println(sedan.getColor() + " 승용차의 속도는 " + sedan.getSpeed() + "이고 좌석수는 " + sedan.getSeat() + "개 입니다.");
		System.out.println(truck.getColor() + " 트럭의 속도는 " + truck.getSpeed() + "이고 적재량은 " + truck.getCarry() + "톤 입니다.");

	}

}
