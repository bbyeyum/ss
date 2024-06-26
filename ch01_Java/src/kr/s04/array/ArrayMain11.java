package kr.s04.array;

public class ArrayMain11 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * double 형인 배열의 모든 요소의 합과 평균을 구하는 프로그램을 작성하시오.
		 * 
		 * [입력 예시]
		 * 요소의 수: 3
		 * a[0] = 2.2 (input.nextdouble())
		 * a[1] = 2.2
		 * a[2] = 3.3
		 * 
		 * [출력 예시]
		 * 모든 요소의 합은 7.7입니다. (system.out.println 사용)
		 * 모든 요소의 평균 2.57입니다. (system.out.printf 사용)
		 */
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("요소의 수: ");
		int num = input.nextInt();
		double[] a = new double[num];
		
		double sum = 0.0;
		double avg;
		
		for(int i = 0; i < a.length; i++) {
			//반복문으로 배열 인덱스마다 데이터 입력하여 넣기 
			System.out.print("a["+ i + "] = ");
			a[i] = input.nextDouble();
			//총합 구하기
			sum += a[i];
		}
		//평균 구하기
		avg = sum / a.length;
		//출력하기
		System.out.println("모든 요소의 합은 " + sum + "입니다.");
		System.out.printf("모든 요소의 평균 %.2f입니다." , avg);
		
		
		input.close();
	}
}
