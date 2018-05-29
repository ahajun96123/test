package java04;


public class Ch4_19_sil {

	public static void main(String[] args) {
		int sum=0;
		int i = 0;
		int s=1;
		int num=1;
		/*while(true) {
			if(i%2==1) {
				sum+=i;
			}
			else {
				sum+=-i;
			}
			if(sum>=100) {
				System.out.println(i);break;
			}i++;
		}*/
		for(i=1; sum<100; i++,s=-s) {
			num=i*s;
			sum+=num;
		}System.out.println("숫자 : "+num);
		System.out.println("합계 : "+sum);

	}

}
