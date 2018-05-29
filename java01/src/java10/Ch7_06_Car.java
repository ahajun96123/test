package java10;

public class Ch7_06_Car {
	//필드, 메소드, final메소드 선언
	int speed = 250;
	String model = "BMW";
	
	void model() {
		System.out.println("모델 : "+this.model);
	}
	
	final void speed() {
		System.out.println("속도 : "+this.speed);
	}

}
