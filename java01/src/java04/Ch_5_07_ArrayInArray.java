package java04;

public class Ch_5_07_ArrayInArray {

	public static void main(String[] args) {
		//2차원 배열 선언. 배열의 크기 2행3열
		int[][] mathScores=new int[2][3];
		for(int i=0; i<mathScores.length; i++) {
			for(int k=0; k<mathScores[i].length;k++) {
				System.out.println("mathScore["+i+"]["+k+"]="+mathScores[i][i]);
			}
		}System.out.println();
		
		int[][] englishScores=new int[2][];
		englishScores[0]=new int[2];	//1행에 2개의 열 배정
		englishScores[1]=new int[3];	//2행에 3개의 열 배정
		for(int i=0; i<englishScores.length; i++) {
			for(int k=0;k<englishScores[i].length; k++) {
				System.out.println("englishScores["+i+"]["+k+"]="+englishScores[i][k]);
			}
		}
		int[][] javaScores= {{95,80,100},{92,96,80}};
		

	}

}
