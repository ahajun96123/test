package java05;

public class Ch5_15_foreach__sil {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		String[] arr2 = {"사과","배","바나나","체리","딸기","포도"};
		int sum=0;
		for(int arr : arr1) {
			System.out.print(arr+" ");
			sum += arr;
		}
		System.out.println("배열의 합은 : "+sum);
		for(String arr : arr2) {
			System.out.print(arr+" ");
		}

	}

}
