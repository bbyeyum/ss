package kr.s23.object.inter;

//인터페이스   - 인터페이스는 상수와 추상메서드만을 가질 수 있다.
//          - 형식만 있고 내용이 없다.   
interface A2{
	//추상메서드
	public abstract void abc(); //원형
	void def();  //public abstract 생략 가능
}

class B2 implements A2{
	//인터페이스의 추상메서드를 구현         - 추상 메서드를 가지고 있는 클래스를 상속받거나 인터페이스를 구현하려면
	//                                 상속받은 클래스에 추상메서드를 구현해줘야 한다.
	@Override
	public void abc() {
		System.out.println("abc 메서드");
    }
	@Override
	public void def() {
		System.out.println("def 메서드");
    }
}



public class InterfaceMain02 {
	public static void main(String[] args) {
		B2 bp = new B2();
		bp.abc();
		bp.def();
	}
}
