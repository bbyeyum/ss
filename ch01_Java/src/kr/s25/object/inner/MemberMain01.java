package kr.s25.object.inner;

class Outer{
	//Outer 의 멤버 변수
	int x = 100;
	
	//내부클래스(멤버 내부클래스)
	class Inner{
		//Inner 의 멤버 변수
		int y = 200;
	}
}

public class MemberMain01 {
	public static void main(String[] args) {
		Outer ot = new Outer();
		//Outer 내부클래스인 Inner 클래스의 객체 생성
		Outer.Inner oi = ot.new Inner();
		
		//Outer 의 멤버변수 호출
		System.out.println(ot.x);
		//Inner 의 멤버변수 호출
		System.out.println(oi.y);
	}
}
