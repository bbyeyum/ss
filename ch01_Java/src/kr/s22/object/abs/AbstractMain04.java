package kr.s22.object.abs;

//추상클래스
abstract class AbsEx{
	int a = 100;
	
	public int getA() {
		return a;
}
	//추상메서드 (abstract public 둘 중 뭐가 먼저 와도 상관없음)
	abstract public int getB();
	public abstract int getC();
}

abstract class AbsEx2 extends AbsEx{
	//추상클래스를 추상클래스에 상속하면 추상메서드 구현의 의무가 없음
	String msg = "신세계";
	//추상메서드
	public abstract String getMsg();
	//부모클래스의 추상메서드 구현
	@Override 
	public int getB() {
		return 200;
	}
}



public class AbstractMain04 extends AbsEx2{
	//부모클래스의 추상메서드를 구현
	@Override
	public int getC() {
		return 200;
	}
	
	@Override
	public String getMsg() {
		return msg;
	}
	
	public static void main(String[] args) {
		AbstractMain04 am = new AbstractMain04();
		System.out.println(am.getA());
		System.out.println(am.getB());
		System.out.println(am.getC());
		System.out.println(am.getMsg());
			
	}
}
