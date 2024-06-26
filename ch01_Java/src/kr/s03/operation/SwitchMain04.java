package kr.s03.operation;

public class SwitchMain04 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 두 개의 정수와 연산자를 입력한 후 연산의 결과를 출력하시오.
		 * 
		 * [입력 예시]
		 * 첫번째 수: 10
		 * 연산자: +
		 * 두번째 수: 20
		 * 
		 * [출력 예시]
		 * 10 + 20 = 30
		 */
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int result = 0;
		
		System.out.println("첫번째 수: ");
		int a = input.nextInt();
		
		System.out.println("연산자: ");
		String b = input.next();
		
		System.out.println("두번째 수: ");
		int c = input.nextInt();
		
		switch(b) {
		case "+":
			result = a + c; break;
		case "-":
			result = a - c; break;
		case "*":
			result = a * c; break;
		case "/":
			if(c == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				System.exit(0);
			}else {
			result = a / c; 
			}break;
		case "%":
			if(c == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				System.exit(0);
			}else {
			result = a % c; 
			}break;
		default:
			System.out.println("잘못된 연산자 입력");		
			System.exit(0);
		}
		
		System.out.println(); 
		System.out.printf("%d %s %d = %d",a, b, c, result);
		
		input.close();
	}
}
