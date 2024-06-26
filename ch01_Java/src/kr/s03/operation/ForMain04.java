package kr.s03.operation;

public class ForMain04 {
	public static void main(String[] args) {
		
		
		//구구단 만들기 
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("단 입력: ");
		int dan = input.nextInt();
		
		System.out.println(dan + "단");
		System.out.println("-------------");
		
		//곱해지는 숫자
		for(int i=1; i<=9; i++) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}
		
		input.close();
	}
}
