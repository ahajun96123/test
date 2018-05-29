package java03;

public class If_Dice_ex {
/*
 * random 메소드
 * Math.random() : double 실수0.0<=1.0
 * 0~9까지의 난수를 발생시키려면
 * (int)(Math.random()*10)
 * 1~10까지의 난수
 * (int)(Math.random()*10)+1
 * 로또번호
 * (int)(Math.random()*45)+1
 */
	public static void main(String[] args) {
		int i = (int)(Math.random()*6)+1;
		if(i==1) {
			System.out.println("1번이 나왔습니다.");
		}
		else if(i==2) {
			System.out.println("2번이 나왔습니다.");
		}
		else if(i==3) {
			System.out.println("3번이 나왔습니다.");
		}
		else if(i==4) {
			System.out.println("4번이 나왔습니다.");
		}
		else if(i==5) {
			System.out.println("5번이 나왔습니다.");
		}
		else{
			System.out.println("6번이 나왔습니다.");
		}

	}

}
