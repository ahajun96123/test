package java01;

public class BooleanExample {

	public static void main(String[] args) {
		/*
		 * 불타입(Boolean)변수는true, false의 값만 가질 수 있음.
		 * true = 1, false = 0으로 인식
		 */
		//bool 타입의 stop 변수 선언.
		boolean stop = false;
		
		if(stop) {
			System.out.println("중지합니다.");
		}else {
			System.out.println("시작합니다.");
		}

	}

}
