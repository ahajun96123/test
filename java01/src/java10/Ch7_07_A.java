package java10;

//protected 접근 제한자는 같은 패키지 내에서는 접근 가능.
//다른 패키지에서는 상속 받은 클래스만 접근 가능
public class Ch7_07_A {
	protected int a = 10;
	
	protected Ch7_07_A() {
		
	}
	
	protected void a() {
		System.out.println("a 출력 : "+a);
	}

}
