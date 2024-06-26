package kr.s18.object.poly;
//부모클래스
class Parent{
	int a = 100;
}

//자식클래스
class Child extends Parent{
	int b = 200;
}

public class PolyMain01 {
	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println(ch.a);
		System.out.println(ch.b);
		
		Parent p = ch; //자식 클래스 타입 → 부모 클래스 타입으로 형 변환
					   //업 캐스팅, 자동적으로 형변환
		System.out.println(p.a);
		//System.out.println(p.b);  → 호출 범위를 벗어나서 호출 불가능, 메모리에는 존재함 
		
		Child ch2 = (Child) p; // 부모 클래스 타입 → 자식 클래스 타입으로 형 변환
							   // 다운 캐스팅
							   // 부모에서 자식 클래스로 변환할 때는 무조건 (Child)와 같이 명시적 형변환 해줘야됨
		System.out.println(ch2.a);
		System.out.println(ch2.b);
	
	}
}
