package kr.s08.object.method;

public class OverloadingMain02 {
	public void getLength(int n) {
		String s = String.valueOf(n);//int → String
		getLength(s);
	}
	
	public void getLength(float n) {
		String s = String.valueOf(n); //float → String
		getLength(s); // s 의 자료형이 String 으로 되어 있기 때문에 ↓ 아래 메서드가 실행됨
	}
	
	public void getLength(String s) {
		System.out.println(s + "의 길이: " + s.length());
	}
	
	public static void main(String[] args) {
		OverloadingMain02 om = new OverloadingMain02();
		om.getLength(500000);
		om.getLength(3.14f); //3.14f → 문자로 바꾸면 3.14만 남는다, .도 카운팅에 포함되어 4로 나옴
		om.getLength("Hello");
	}
}
