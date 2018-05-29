package java06;

public class Ch6_07_CarExample {

	public static void main(String[] args) {
		//Car 클래스의 객체 생성
		Ch6_07_Car car = new Ch6_07_Car();
		//setGas 메소드 호출. 매개값은 5.
		car.setGas(5);
		
		//isLeftGas 메소드 호출 결과를 gsaState라는 변수에 담으세요.
		boolean gasState = car.isLeftGas();
		
		if(gasState) {
			System.out.println(car.isLeftGas());
			car.run();
		}
		if(car.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}

	}

}
