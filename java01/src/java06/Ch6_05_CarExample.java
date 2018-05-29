package java06;

public class Ch6_05_CarExample {

	public static void main(String[] args) {
		//1. 기본 생성자를 이용한 객체 생성하여 필드값 출력
		
		//2. model 매개변수 갖는 생성자를 이용한 객체 생성하여 필드값 출력
		
		//3. model, color 매개변수 갖는 생성자를 이용한 객체 생성하여 필드값 출력
		
		//3. model, color, maxSpeed 매개변수 갖는 생성자를 이용한 객체 생성하여 필드값 출력
		
		Ch6_05_Car car1 = new Ch6_05_Car();
		System.out.println("car1의 company 필드값 : "+car1.company);
		System.out.println("car1의 model 필드값 : "+car1.model);
		System.out.println("car1의 color 필드값 : "+car1.color);
		System.out.println("car1의 maxSpeed 필드값 : "+car1.maxSpeed);
		
		Ch6_05_Car car2 = new Ch6_05_Car("bentz Sclass");
		System.out.println("car2의 company 필드값 : "+car2.company);
		System.out.println("car2의 model 필드값 : "+car2.model);
		System.out.println("car2의 color 필드값 : "+car2.color);
		System.out.println("car2의 maxSpeed 필드값 : "+car2.maxSpeed);
		
		Ch6_05_Car car3 = new Ch6_05_Car("bentz Sclass", "검정색");
		System.out.println("car3의 company 필드값 : "+car3.company);
		System.out.println("car3의 model 필드값 : "+car3.model);
		System.out.println("car3의 color 필드값 : "+car3.color);
		System.out.println("car3의 maxSpeed 필드값 : "+car3.maxSpeed);
		
		Ch6_05_Car car4 = new Ch6_05_Car("bentz Sclass", "검정색", 430);
		System.out.println("car4의 company 필드값 : "+car4.company);
		System.out.println("car4의 model 필드값 : "+car4.model);
		System.out.println("car4의 color 필드값 : "+car4.color);
		System.out.println("car4의 maxSpeed 필드값 : "+car4.maxSpeed);
		

	}

}
