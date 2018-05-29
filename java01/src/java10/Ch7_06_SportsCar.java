package java10;

public class Ch7_06_SportsCar extends Ch7_06_Car {
	
	String model = "Lamborghini";
	int speed = 380;
	
	@Override
	void model() {
		System.out.println("모델 : "+this.model);
	}
	/*@Override
	final void speed() {
		System.out.println("속도 : "+this.speed);
	}*/
	public static void main(String[] args) {
		Ch7_06_SportsCar a = new Ch7_06_SportsCar();
		a.model();
	}

}
