package java06;

//CarExample 클래스
public class Ch6_02_CarExample {

	public static void main(String[] args) {
		//Car 클래스 객체 선언
		//Car 클래스에서 선언한 필드 값을 출력해 보세요.
		Ch6_02_Car s1 = new Ch6_02_Car();
		int max = s1.maxSpeed;
		int spe = s1.speed;
		String com = s1.company;
		String mod = s1.model;
		String col = s1.color;
		System.out.println("Car 클래스의 company 필드값 : "+com);
		System.out.println("Car 클래스의 model 필드값 : "+mod);
		System.out.println("Car 클래스의 color 필드값 : "+col);
		System.out.println("Car 클래스의 maxSpeed 필드값 : "+max);
		System.out.println("Car 클래스의 speed 필드값 : "+spe);
		
		//필드값 변경
		/*int number = 10;
		number = 30;*/
		spe = 60;
		System.out.println("Car 클래스의 speed 필드값 : "+spe);

	}

}
