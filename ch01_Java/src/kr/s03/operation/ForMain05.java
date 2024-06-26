package kr.s03.operation;

public class ForMain05 {
	public static void main(String[] args) {
		//2~9단까지 출력하기 위해 다중 for 문 사용
		for(int dan=2; dan<=9; dan++) {
			System.out.println("**" + dan + "단**");
			
			for(int han=1; han<=9; han++) {
				System.out.println(dan + "*" + han + "=" + dan*han);
			}
			System.out.println();
			System.out.println("-----------");
		}
	}
}
