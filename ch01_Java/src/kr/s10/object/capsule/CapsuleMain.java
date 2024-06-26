package kr.s10.object.capsule;

class Capsule{
	//private 은 같은 클래스내에서만 접근이 가능함
	//은닉화
	private int a;
	
	//캡슐화
	public void setA(int n) {
		if(n>=0) {
		a = n;
		}else {
			System.out.println("음수는 허용되지 않습니다.");
		}
	}
	
	public int getA() {
		return a;
	}
}

public class CapsuleMain {
	public static void main(String[] args) {
		Capsule cap = new Capsule();
		// System.out.println(cap.a); → 변수 a 의 접근 제한자가 private 이기 때문에 
		//								다른 클래스에서 호출이 불가능함
		cap.setA(-10);//데이터 저장
		System.out.println(cap.getA()); //데이터 호출
	}
}
