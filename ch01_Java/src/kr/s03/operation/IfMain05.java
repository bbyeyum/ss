package kr.s03.operation;

public class IfMain05 {
	public static void main(String [] args) {
		/*
		 * [실습]
		 * 정수 하나를 입력하여 짝수면 10을 더하고 홀수면 20을 더하여 
		 * 결과 값을 출력하시오.
		 * 
		 * [입력 예시]
		 * 정수 하나 입력: 5
		 * 
		 * [출력 예시]
		 * 결과: 25
		 * 
		 */
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("정수 하나 입력: ");
		int num = input.nextInt();
		
		if(num % 2 == 0) {
			num = num + 10;
		}else {
			num = num + 20;
		}
		
		System.out.println("결과: " + num);
		input.close();
		
	}
}
