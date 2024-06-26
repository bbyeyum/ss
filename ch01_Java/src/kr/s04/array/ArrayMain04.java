package kr.s04.array;

public class ArrayMain04 {
	public static void main(String[] args) {
		int sum = 0;			//총점을 저장하는 변수
		float average = 0.0f;	//평균을 저장하는 변수
		
		//배열 선언, 생성, 초기화
		int[]score = {100, 88, 88, 100, 90}; //length = 5
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		average = (float)sum /score.length;
		
		System.out.printf("총점: %d%n", sum);
		System.out.printf("평균: %.2f", average);
	}
}
