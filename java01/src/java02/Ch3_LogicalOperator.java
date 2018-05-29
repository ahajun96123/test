package java02;
//논리 연산자
/*
 * 논리연산은 true, false를 가지고 연산을 수행함.
 * AND 연산(&&)
 * 		A&&B : A, B가 모두 true면 결과는  true. 하나라도 false면 결과는 false
 * OR 연산(||)
 * 		A||B : A,B, 둘중 하나라도 true면 결과는 true. 둘다 false면 결과는 false
 * NOT 연산(!)
 * 		true->false, false->true
 */
public class Ch3_LogicalOperator {

	public static void main(String[] args) {
		int charCode = 'A';
		System.out.println(charCode);
		
		if( (charCode>=65) && (charCode<=90)) {
			System.out.println("대문자 이군요");
		}
		if( (charCode>=97) && (charCode<=122)) {
			System.out.println("소문자 이군요");
		}
		if( !(charCode<48) && !(charCode>57)) {
			System.out.println("0~9숫자 이군요");
		}
		int value = 6;
		if( (value%2==0) || (value%3==0)) {
			System.out.println("2또는 3의 배수 이군요");
		}
		if( (value%2==0) || (value%3==0)) {
			System.out.println("2또는 3의 배수 이군요");
		}

	}

}
