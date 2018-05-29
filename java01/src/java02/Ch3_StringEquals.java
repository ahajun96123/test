package java02;

public class Ch3_StringEquals {

	public static void main(String[] args) {
		String strVar1 = "이준모";
		String strVar2 = "이준모";
		String strVar3 = new String("이준모");
		//new 연산자 : 새로운 객체를 생성할때 상ㅇ하는 연산자
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		System.out.println();
		System.out.println(strVar1.equals(strVar2));
		//String을 비교할때는 '==' 사용하지 말고 .equals()를 사용해라 
		System.out.println(strVar1.equals(strVar3));

	}

}
