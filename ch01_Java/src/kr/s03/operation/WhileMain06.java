package kr.s03.operation;

public class WhileMain06 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int a, total = 0;
		System.out.println("0전까지 입력받은 정수로 합 구하기");
		
		while(true) {
			System.out.println("누적할 정수 입력: ");
			a = input.nextInt();
			
			if(a==0) {
				break; //반복문을 빠져 나감
			}
			
			total += a;
		}
		System.out.println("total= " + total);
		
		input.close();
	}
}
