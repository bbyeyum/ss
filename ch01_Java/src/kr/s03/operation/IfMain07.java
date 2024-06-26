package kr.s03.operation;

public class IfMain07 {
	public static void main(String [] args) {
		/*
		 * [실습]
		 * 생년월일을 입력하고 만 나이를 출력하는 프로그램을 작성하시오.
		 * 만 나이 = (현재 연도 - 태어난 연도) - (생일이 지났으면 0, 생일이 지나지 않았으면 1)
		 * 
		 * [입력 예시]
		 * 출생 연도 입력: 2000
		 * 월 입력: 3
		 * 일 입력: 12
		 * 
		 * [출력 예시]
		 * 만 나이는 23
		 */
		
		int nowYear = 2024;
		int nowMonth = 2;
		int nowDate = 20;
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("출생 연도 입력: ");
		int a = input.nextInt();
		
		System.out.println("월 입력: ");
		int b = input.nextInt();
		
		System.out.println("일 입력: ");
		int c = input.nextInt();
		
		int d = nowYear - a;
		
	

//		if(nowMonth < b) {
//			d--;
//		}else if(nowMonth == b && nowDate < c) {
//			d--;
//		}
		
		if(nowMonth < b || (nowMonth == b && nowDate < c)) {
			d--;
		}
		System.out.println("만 나이는 " + d);
		
		input.close();
	}
}
