package java07;

//getter, setter 메소드를 사용하는 클래스
public class Ch6_17_CarExample {

	public static void main(String[] args) {
		Ch6_17_Car car = new Ch6_17_Car();
		
		//setter를 호출하여 속도 값을 설정
		car.setSpeed(100);
		
		if(!car.isStop()) {
			car.setStop(true);
		}
		
		System.out.println("현재 속도 : " + car.getSpeed());

	}

}
