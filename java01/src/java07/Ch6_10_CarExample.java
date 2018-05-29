package java07;

public class Ch6_10_CarExample {

	public static void main(String[] args) {
		Ch6_10_Car myCar = new Ch6_10_Car("포르쉐");
		//객체를 생성할 때 매개변수를 어떻게 전달하는지..
		Ch6_10_Car yourCar = new Ch6_10_Car("벤츠");
		
		myCar.run();
		yourCar.run();

	}

}
