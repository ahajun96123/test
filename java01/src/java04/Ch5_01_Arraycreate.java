package java04;

public class Ch5_01_Arraycreate {

	public static void main(String[] args) {
		//배열 선언: int 타입의 scores라는 배열 변수 선언
		//int[] scores;
		int[] scores = {83,90,87};
		
		//배열 값 접근(출력)
		System.out.println("scores[0]의 값 : "+scores[0]);
		System.out.println("scores[1]의 값 : "+scores[1]);
		System.out.println("scores[2]의 값 : "+scores[2]);
		
		//배열 요소들의 합 구하기
		int sum=0;
		for(int i=0; i<=2; i++) {
			sum+=scores[i];
		}
		System.out.println("총합 : "+sum);
		double avg = sum/3;
		System.out.println("평균 : "+avg);

	}

}
