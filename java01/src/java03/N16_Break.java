package java03;

public class N16_Break {

	public static void main(String[] args) {
		//무한 반복문
		while(true) {
			int num = (int)(Math.random()*6+1);
			System.out.println(num);
			//주사위가 6이 나왔을때 반복문 종료
			if(num==6)
				break;
		}

	}

}
