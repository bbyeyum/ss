package kr.s03.operation;

public class IfMain08 {
	public static void main(String [] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int result = 0; //연산의 결과를 저장할 변수 선언 및 초기화
		
		System.out.println("첫번째 수: ");
		int first = input.nextInt();
		System.out.print("연산자: ");
		String operator = input.next(); //공백 없이 입력할거면 nextLine()
		System.out.println("두번째 수: ");
		int second = input.nextInt();
		
		if(operator.equals("+")) {
			result = first + second;
		}else if(operator.equals("-")) {
			result = first - second;
		}else if(operator.equals("*")) {
			result = first * second;
		}else if(operator.equals("/")) {
			if(second!=0) {
				result = first / second;
			}else {
				System.out.println("0으로 나눌 수 없습니다."); //프로그램 종료
				System.exit(0);
			}
		}else if(operator.equals("%")) {
			if(second!=0) {
				result = first / second;
			}else {
				System.out.println("0으로 나눌 수 없습니다."); //프로그램 종료
				System.exit(0);
			}	
		}else {
			System.out.println("잘못된 연산자 입력");
			//프로그램 종료
			System.exit(0);
		}
		
		System.out.println(); //단순 줄바꿈
		System.out.printf("%d %s %d = %d",first, operator, second, result);
		
		
		
		input.close();
	}
}
