package java02;
//대입연산자
/*
 * +=, -=, *=, /=, %=
 * A+=B => A=A+B
 */
public class Ch_3AssignmentOperator {

	public static void main(String[] args) {
		int result = 0;
		result += 10;
		//result = result + 10;
		System.out.println("result="+result);
		
		result -= 5;
		//result = result - 5;
		System.out.println("result="+result);
		
		result *= 3;
		System.out.println("result="+result);
		
		result /=5;
		System.out.println("result="+result);
		
		result %= 3;
		System.out.println("result="+result);

	}

}
