package java02;

public class PromotionExample {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		//기존 byte 타입의 변수가 int 타입으로 자동 타입변환 발생
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;
		//기존 char 타입의 변수가 int 타입으로 자동 타입변환 발생
		System.out.println("가의 유니코드 = "+intValue);
		
		intValue = 500;
		long longValue = intValue;
		//기존 int 타입의 변수가 long 타입으로 자동 타입변환 발생
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);

	}

}
