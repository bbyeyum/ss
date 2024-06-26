package kr.s18.object.poly;
//부모클래스
class A{
	public void make() {
		System.out.println("make 메서드");
	}
}

class B extends A{
	public void play() {
		System.out.println("play 메서드");
	}
 }

public class PolyMain02 {
	public static void main(String[] args) {
		B bp = new B();
		bp.make();
		bp.play();
		
		A ap = bp; //자식 클래스 타입 → 부모 클래스 타입으로 형 변환
				   //업 캐스팅, 자동적으로 형변환
		ap.make();
		//ap.play();  → 호출 범위를 벗어나서 호출 불가능, 메모리에는 존재함
		
		B bp2 = (B)ap; // 부모 클래스 타입 → 자식 클래스 타입으로 형 변환
		   			   // 다운 캐스팅
		               // 부모에서 자식 클래스로 변환할 때는 무조건 (B)와 같이 명시적 형변환 해줘야됨
		bp2.make();
		bp2.play();
		
		
	}
}
