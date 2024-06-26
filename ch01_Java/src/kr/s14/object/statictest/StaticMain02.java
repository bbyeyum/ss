package kr.s14.object.statictest;

class StaticMethod{
	String s1 = "행복";              //인스턴스 변수 → 객체가 생성되야 호출 가능
	static String s2 = "행운";		//static(클래스) 변수 → 객체 상관없이 호출 가능 
	
	//static (클래스) 메서드
	public static String getString() {  //static(클래스) 메서드 → 객체 생성 없이 호출
		return s2;						//static 메서드가 객체 없이 호출 되기 때문에 
										//객체가 필요한 인스턴스 변수 s1은 호출할 수 없음
										//그래서 객체 없이 쓸 수 있는 클래스 변수 s2만 호출 가능하다
	}
	//인스턴스 메서드
	public String gettring() {
		return s1;
	}
}


public class StaticMain02 {
	public static void main(String[] args) {
		//static 메서드는 객체 생성 없이 호출할 수 있고 클래스명.메서드명의 형태로 호출
		System.out.println(StaticMethod.getString());
		
		//static 변수는 클래스명.변수명의 형태로 호출
		System.out.println(StaticMethod.s2);
		
		System.out.println("------------------------------------------------");
		
		//인스턴스 메서드는 객체를 생성해야 호출이 가능함
		StaticMethod sm = new StaticMethod();
		System.out.println(sm.gettring());
		
		//인스턴스 변수도 객체를 생성해야 호출이 가능함
		System.out.println(sm.s1);
	}
}
