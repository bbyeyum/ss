package kr.s23.object.inter;

//인터페이스   - 인터페이스는 상수와 추상메서드만을 가질 수 있다.
//			- 인터페이스는 일반메서드는 가질 수 없다.
interface A1{
	//상수 
	public static final int W	 = 10; //원형 
	int x = 20;
	static int y = 30;
	final int z = 40; // public, static ,final  생략해서 사용해도 원형이랑 같은 의미이다.
}

public class InterfaceMain01 {
	public static void main(String[] args) {
		//인터페이스는 객체 생성 불가능하며 호출만 가능하다.
		//A1 ap = new A1(); 
		
		// w, x, y, z 는 상수라 값 변경 불가능
		//A1.x = 50;
		
		System.out.println("W : " + A1.W);
		System.out.println("X : " + A1.x);
		System.out.println("Y : " + A1.y);
		System.out.println("Z : " + A1.z);
		
	}
}
