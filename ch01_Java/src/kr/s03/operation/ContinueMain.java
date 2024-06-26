package kr.s03.operation;

public class ContinueMain {
	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			
			//특정 조건일 때 수행문의 실행을 멈추고 다음 반복 회차로 지나감
			if(i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
