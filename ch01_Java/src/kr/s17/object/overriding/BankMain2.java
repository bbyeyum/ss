package kr.s17.object.overriding;
import java.util.Scanner;


public class BankMain2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//마이너스 계좌 생성
		MinusAccount ma = new MinusAccount("123-456", "1234", "김연아", 10000L, 100000L);

		//계좌 정보 출력
		ma.printAccount();
		
		
		//출금하기
		System.out.print("출금: ");
		long money = input.nextLong();
		ma.withdraw(money);
		ma.printAccount();
		
		input.close();
	}
}
