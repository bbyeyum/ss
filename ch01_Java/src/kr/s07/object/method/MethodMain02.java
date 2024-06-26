package kr.s07.object.method;

public class MethodMain02 {
	/*
	 * [실습]
	 * 입력한 int형 정수값이 음수이면 -1을, 0이면 0을, 양수이면 1을 
	 * 반환하는 signOf 메서드를 작성하자 
	 */
	
	public int signOf(int n){
		if(n > 0) {
			n = 1;
		}else if(n < 0) {
			n = -1;
		}else {
			n = 0;
		}
		return n;
	}
	
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("정수: ");
		int number = input.nextInt();
		
		MethodMain02 method = new MethodMain02();
		int result = method.signOf(number);
		
		System.out.println("signOf는 " + result + "입니다.");
		input.close();
	}
}
