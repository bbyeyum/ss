package kr.s03.operation;

public class SwitchMain03 {
	public static void main(String [] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int score;
		char grade;
		
		System.out.println("성적 입력: ");
		score = input.nextInt();
		
		if(score < 0 || score > 100) {
			System.out.println("성적은 0 ~ 100만 입력 가능");
			System.exit(0);
		}
		
		/*
		 *  A: 100
		 *  A: 90 ~ 99
		 *  B: 80 ~ 89
		 *  C: 70 ~ 79
		 *  D: 60 ~ 69
		 *  F: 0  ~ 59
		 */
		
		switch(score / 10) {
		case 10:      //아래 수행문이랑 중복되기 때문에 생략 (break가 없으면 다음 수행문으로 넘어감) 
		case 9:
			grade = 'A'; break;
		case 8:
			grade = 'B'; break;
		case 7:
			grade = 'C'; break;
		case 6:
			grade = 'D'; break;
		default:
			grade = 'F';
			
		}
		System.out.println();
		
		System.out.printf("성적: %d%n", score);
		System.out.printf("등급: %c%n", grade);
		
		input.close();
	}
}
