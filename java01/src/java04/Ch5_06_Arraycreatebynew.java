package java04;

public class Ch5_06_Arraycreatebynew {

	public static void main(String[] args) {
		int scores[]=new int[5];	//총 5개의 값을 담을 수 있는 배열 변수 scores 선언
		int[] arr1 = new int[3];
		for(int i = 0; i<3; i++) {
			System.out.println("arr["+i+"] : "+arr1[i]);
		}
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		int sum=0;
		for(int i=0; i<3; i++) {
			sum+=arr1[i];
			System.out.println("arr1["+i+"] : "+arr1[i]);
		}
		System.out.println(sum);
	}

}
