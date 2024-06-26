package kr.s15.object.thistest;

public class LocalVariable {
	//멤버 변수: 클래스 블럭 내에서 정의된 변수
	int b = 200;
	
	public void make() {
		/*
		 * 지역 변수: 메서드, 생성자, 제어문 블럭 내에서 생성된 변수,
		 * 			해당 블럭이 종료되면 변수는 소멸함
		 */
		int a = 100;
		System.out.println("지역 변수 a: " + a);
		System.out.println("멤버 변수 b: " + b);
	}
	
	public void fun() {
		//make 메서드 지역을 벗어났기 때문에 지역 변수 a 를 호출 할 수 없음
		//System.out.println("지역 변수 a: " + a);
		System.out.println("멤버 변수 b: " + b);
	}
	
	public static void main(String[] args) {
		//제어문
		for(int i = 1; i <= 5; i++) {
			System.out.print(i + "\t");
		}
		System.out.println("\n------------------------");
		//제어문 블럭에서만 사용 가능한 지역변수이기 때문에 제어문 블럭 밖에서는 호출할 수 없음
		//System.out.println(i);
		
		int a;
		for(a = 1; a <= 5; a++) {
			System.out.print(a + "\t");
		}
		System.out.println("\n------------------------");
		System.out.println(a);
	}
}
