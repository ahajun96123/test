package java03;

public class ch4_if {
	public static void main(String[] args){
		
		int score = 93;
		
		/*if(score>=90)
		 * 	System.out.println("if문 실행");*/
		//조건식 score 가 90 이상일 경우 실행
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		
		if(score<90) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다.");
		}
	}

}
