package kr.s03.operation;

public class WhileMain05 {
	public static void main(String[] args) {
		
		//0 입력 시 종료되는 정수 누적 프로그램 만들기
		java.util.Scanner input = new java.util.Scanner(System.in);
		int a, total = 0;
		
		System.out.println("0전까지 입력받은 정수로 합 구하기");
		System.out.print("누적할 정수 데이터 입력: ");
		
		while((a = input.nextInt())!=0) {
			total += a;
			System.out.print("누적할 정수 데이터 입력: ");
		}
		
		System.out.println("total = " + total);
		input.close();
	}
}
