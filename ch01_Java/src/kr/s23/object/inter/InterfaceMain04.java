package kr.s23.object.inter;
//인터페이스
interface I{
	//추상메서드
	public abstract void play();
}
class Pianist implements I{
	@Override
	public void play() {
		System.out.println("피아노를 연주하다");
	}
}
class Cellist implements I{
	@Override
	public void play() {
		System.out.println("첼로를 연주하다");
	}
}
class Stage{
	public void autoPlay(I i) {// Object 에는 play 메서드가 없기 때문에 인터페이스 타입을 객체로 넣음( I i)
		i.play();
	}
}

public class InterfaceMain04 {
	public static void main(String[] args) {
		Stage a = new Stage();
		a.autoPlay(new Pianist());  //Pianist (클래스 타입) → I(인터페이스 타입)으로 형변환 (자동적 형변환)
		a.autoPlay(new Cellist());  //Cellist (클래스 타입) → I(인터페이스 타입)으로 형변환 (자동적 형변환)	
	}
}
