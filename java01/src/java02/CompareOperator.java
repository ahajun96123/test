package java02;

public class CompareOperator {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);
		//v2가 double 타입으로 자동 형변환된 후 비교연산 수행
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5);
		//0.1f는 근사치. 실제 값은 0.1000000000223243
		System.out.println((float)v4 == v5);
		System.out.println((int)(v4*10)==(int)(v5*10));

	}

}
