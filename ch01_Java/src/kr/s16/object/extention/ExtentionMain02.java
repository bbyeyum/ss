package kr.s16.object.extention;

//부모 클래스
class People{ //extends Object → 가장 최상위 클래스 Object 를 상속 받아서 사용
	public void eat() {
		System.out.println("식사하다");
	}
}
//자식 클래스
class Student extends People{
	public void study() {
		System.out.println("공부하다");
		
	}
}

public class ExtentionMain02 {
	public static void main(String[] args) {
		Student s = new Student();
		s.eat();   //People 의 메서드를 상속 받아서 호출
		s.study(); //Student 의 메서드
		System.out.println(s.toString()); //Object 의 메서드를 상속받아서 호출 (s 의 참조값이 출력됨)
	}
}
