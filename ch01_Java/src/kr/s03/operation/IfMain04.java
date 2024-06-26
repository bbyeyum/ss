package kr.s03.operation;

public class IfMain04 {
	public static void main(String [] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int score;
		char grade;
		
		System.out.println("성적 입력: ");
		score = input.nextInt();
		
		//다중 if문
		if(score >= 90 && score <= 100) {
			grade = 'A';
		}else if (score >= 80 && score <= 89) {
			grade = 'B';
		}else if (score >= 70 && score <= 79) {
			grade = 'C';
		}else if(score >= 60 && score <= 69){
			grade = 'D';
		}else if(score >= 0 && score <= 59){
			grade = 'F';
		}else {//100보다 크거나 0보다 작은 수들은 모두 else로 적용된다.
			grade = '?';
		}
		
		System.out.printf("성적: %d%n", score);
		System.out.printf("등급: %c%n", grade);
		
		input.close();
	}
}
