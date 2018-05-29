package java09;

//자식클래스
public class Ch7_04_SuperSonicAirplane extends Ch7_04_Airplane {
	//1의 값을 갖는 NORMAL 상수 정의
	//2의 값을 갖는 SUPERSONIC 상수 정의
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	//fly 메소드 재정의
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행입니다.");
		} else {
			//부모클래스의 메소드 호출(재정의가 안된)
			super.fly();
		}
	}

}
