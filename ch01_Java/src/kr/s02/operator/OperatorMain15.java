package kr.s02.operator;

public class OperatorMain15 {
		public static void main(String[] args) {
			
			 /*
			  * [실습]
			  * 3개의 정수를 입력받아서 최대값, 최소값을 출력하는 프로그램을 작성하시오
			  * 
			  * [입력 예시]
			  * 3개의 정수를 입력받아서 최대값, 최소값을 
			  * 최대값: 10
			  * 최소값: 5
			  * 
			  */
			java.util.Scanner input = new java.util.Scanner(System.in);
			System.out.print("첫번째 정수: ");
			int a = input.nextInt();
			
			System.out.print("두번째 정수: ");
			int b = input.nextInt();
			
			System.out.print("세번째 정수: ");
			int c = input.nextInt();
			
			int max, min;
			
			max = a > b ? a : b;
			max = max > c ? max : c;		
			System.out.printf("최대값: %d%n", max);
				
			
			min = a < b ? a : b;
			min = min < c ? min : c;
			System.out.printf("최소값: %d%n", min);
			
			input.close();
	}
}
