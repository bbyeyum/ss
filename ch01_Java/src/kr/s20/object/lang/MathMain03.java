package kr.s20.object.lang;
import java.util.Scanner;


public class MathMain03 {
	/*
	 * [실습]
	 * 가위바위보 게임
	 * 
	 * [입력 예시]
	 * 가위바위보 입력(0.가위, 1.바위, 2.보): 1
	 * 
	 * [출력 예시]
	 * → 컴퓨터: 가위, 사람: 바위
	 *   결과: 사람 승 
	 */
		
	public static void main(String[] args) {
		String[] item = {"가위", "바위","보"};
	//					    0     1    2
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("------------------------");
			System.out.println("메뉴 | 1.게임하기 | 2.종료하기");
			System.out.println("------------------------");
			System.out.print("메뉴: ");
			int num = input.nextInt();
			
			if(num == 1) {
				System.out.print("가위바위보 입력(0.가위, 1.바위, 2.보): ");
				int user = input.nextInt();
				
				double ran = Math.random();
				
				int computer = (int)(ran*3);
				
				int result = computer -user;
				System.out.println("컴퓨터: " + item[computer] + ", 사람: " + item[user]);
				
				System.out.print("결과: ");
				if(result == -1 || result == 2) {
					System.out.println("사람 승");
				}else if(result == -2 || result == 1) {
					System.out.println("컴퓨터 승");
				}else {
					System.out.println("무승부");
				}
//				System.out.print("컴퓨터: " + item[computer]);
//				System.out.print(", ");
//				
//				//1) 사용자가 가위 냈을 때
//				if(user == 0) {
//					System.out.println("사람: 가위");
//					if(computer == 0) {
//						System.out.println("결과: 무승부");
//					}else if(computer == 1) {
//						System.out.println("결과: 컴퓨터 승");
//					}else {
//						System.out.println("결과: 사람 승");
//					}
//				//2) 사용자가 바위 냈을 때
//				}else if(user == 1) {
//					System.out.println("사람: 바위");
//					if(computer == 0) {
//						System.out.println("결과: 사람 승");
//					}else if(computer == 1) {
//						System.out.println("결과: 무승부");
//					}else {
//						System.out.println("결과: 컴퓨터 승");
//					}
//				//3) 사용자가 보 냈을 때
//				}else if(user == 2) {
//					System.out.println("사람: 보");
//					if(computer == 0) {
//						System.out.println("결과: 컴퓨터 승");
//					}else if(computer == 1) {
//						System.out.println("결과: 사람 승");
//					}else {
//						System.out.println("결과: 무승부");
//					}
//				}else {
//					System.out.println("잘못 입력했습니다.");
//				}
			}else if (num == 2) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("잘못 입력했습니다.");
			}
		}
		
		input.close();
	}
}
