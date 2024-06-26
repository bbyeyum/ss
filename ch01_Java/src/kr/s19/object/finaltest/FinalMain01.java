package kr.s19.object.finaltest;

class A{
	//멤버 필드
	final int NUM = 10; //상수
	public static final int NUMBER = 20;
}

public class FinalMain01 {
	public static void main(String[] args) {
		A ap = new A();
		//ap.NUM = 20;    → 상수는 변경 불가능 
		System.out.println(ap.NUM);
		
		//static 상수 호출
		System.out.println(A.NUMBER);
		
		final int NO = 30;
		System.out.println(NO);
	}
}
