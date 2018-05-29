package java02;

public class Ch3_IncreaseDecreaseOperator {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		System.out.println("----------------------");
		x++;//11	증감연산자가 뒤에오면 세미콜론(연산) 끝나고 적용시켜준다.
		++x;//12	증감연산자가 앞에오면 적용시키고 연산한다.
		System.out.println("x="+x);
		System.out.println("----------------------");
		y--;
		--y;
		System.out.println("y="+y);
		System.out.println("----------------------");
		z=x++;
		System.out.println("z="+z);
		System.out.println("x="+x);
		System.out.println("----------------------");
		z = ++x;
		System.out.println("z="+z);
		System.out.println("x="+x);
		System.out.println("----------------------");
		z = ++x + y++;
		System.out.println("z="+z);
		System.out.println("x="+x);
		System.out.println("y="+y);

	}

}
