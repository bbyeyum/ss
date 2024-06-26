package kr.s25.object.inner;

class Outer2{
	//Outer2 의 멤버 변수
	private int x = 100;
	//내부클래스(멤버 내부클래스)
	class Inner2{
		private int y = 200;
		
		public void make() {
			System.out.println("x: " + x);  //Inner2 메서드에서 Outer2 멤버 변수 사용 가능 
			System.out.println("y: " + y);	//Inner2는 Outer2의 내부클래스 이기때문에 
											// 하나의 멤버처럼 사용 가능하다
		}
	}
}

public class MemberMain02 {
	public static void main(String[] args) {
		Outer2 ot = new Outer2();
		//내부클래스 객체 생성
		Outer2.Inner2 oi = ot.new Inner2();
		oi.make();
	}
}
