package kr.s20.object.lang;

public class SpringMain03 {
	public static void main(String[] args) {
	
		String s1 = " aBa ";
		String s2 = "abc";
		int a = 100;
		String msg = null;
		
		
		msg = s1.toUpperCase();
		System.out.println("msg: " + msg); //모두 대문자 처리 
		
		msg = s1.toLowerCase();
		System.out.println("msg: " + msg); //모두 소문자 처리 
		
		msg = s1.replace("aB", "b"); //old 문자를 new 문자로 대체  aB → b
		System.out.println("msg: " + msg);
		
		msg = s1.trim(); //앞 뒤 공백 제거  (중간 공백은 제거할 수 없음,앞 뒤 공백만 제거)    
		System.out.println("msg: " + msg);
		
		boolean f = s1.contains("aB");  //문자열 중에 메서드의 인자로 전달된 문자열("aB")이 포함되어 있는지 검증
		System.out.println("f: " + f);
		
		f = s2.startsWith("ab");  //메서드의 인자로 전달된 문자열("ab")로 시작하는지 검증
		System.out.println("f: " + f);
		
		f = s2.endsWith("bc");  //메서드의 인자로 전달된 문자열("ab")로 끝나는지 검증
		System.out.println("f: " + f);
		
		msg = String.valueOf(a); // int →  String 형 변환 
		msg = a + "";            // 문자열로 바꿀 수 있는 또다른 방법
			
 }
}
