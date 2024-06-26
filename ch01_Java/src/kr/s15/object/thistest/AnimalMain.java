package kr.s15.object.thistest;


public class AnimalMain {
	/*
	 * [실습]
	 * Animal 
	 * 멤버 변수 : 이름(name), 나이(age), 비행여부(fly), - private (get, set 사용)
	 * 멤버 메서드 : public set/ get 메서드
	 * 생성자: 인자가 있는 생성자, 인자가 없는 생성자 
	 * 
	 * AnimalMain
	 * 인자가 있는 생성자를 이용해서 객체 생성
	 * 이름, 나이, 비행여부를 출력 (비행여부 true/false → 가능/불가능)
	 * 
	 * 인자가 없는 생성자를 이용해서 객체 생성
	 * 이름, 나이, 비행여부 설정
	 * 이름, 나이, 비행여부 출력  (비행여부 true/false → 가능/불가능) * 
	 */
	
	public static void main(String[] args) {
		Animal a = new Animal("독수리", 3, true);
		System.out.println("이름: " + a.getName());
		System.out.println("나이: " + a.getAge());
		//System.out.println("비행여부: " + (a.isFly() ? "가능" : "불가능"));
		System.out.println("비행여부: " + printFly(a.isFly()));
		
		Animal b = new Animal();
		b.setName("고래");
		b.setAge(2);
		b.setFly(false);
		System.out.println("이름: " + b.getName());
		System.out.println("나이: " + b.getAge());
		System.out.println("비행여부: " + printFly(b.isFly()));
	}
	//비행여부 관련 출력 메서드 (이 클래스 내에서만 쓸거니까 private, 메인메서드에서 객체 없이 호출할거라 static)
	private static String printFly(boolean fly) {
		return fly ? "가능" : "불가능";
	}
}
