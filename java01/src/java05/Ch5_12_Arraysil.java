package java05;

public class Ch5_12_Arraysil {

	public static void main(String[] args) {
		double score[][]= {{3.3, 3.4},{3.5, 3.8},{4.2, 4.3},{3.9, 4.0}};
		double avg;
		double sum = 0;
		int k=0;
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
				k++;
			}
		}
		avg = sum/k;
		System.out.println("평점의 평균은 : "+avg);

	}

}
