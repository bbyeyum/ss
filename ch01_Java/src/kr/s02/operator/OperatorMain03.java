package kr.s02.operator;

public class OperatorMain03 {
			public static void main (String [] args) {
				
			/* 
			 *[실습] 
			 * 변수 선언 시 자료형은 모두 int로 지정하고 
			 * 변수 korean, english, math를 선언하고 90, 95, 88로 초기화한다.
			 * 총점을 구해서 변수 sum에 저장, 평균을 구해서 변수 avg에 저장
			 */
				
			int korean = 90;
			int english = 95;
			int math = 88;
			
			int sum = korean + english + math;
			int avg = sum / 3;
			
			System.out.println("국어: " + korean + "점");
			System.out.println("영어: " + english + "점");
			System.out.println("수학: " + math + "점");
			System.out.println("총점: " + sum + "점");
			System.out.println("평균: " + avg + "점");
			
			
	}
}
