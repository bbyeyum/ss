package kr.s24.object.enumtest;

enum Gender{
	MALE, FEMAIL;
	
	//Object 에 있는 toString 을 오버라이딩한 것!!!
	@Override
	public String toString() { //출력 시 MALE, FEMAIL 이 아닌 남자, 여자로 출력될 수 있게 
							   //toString 을 메서드 재정의 해준다.
		switch(this) {
		case MALE: return "남자";
			default: return "여자";
		}
	}
}


public class EnumMain03 {
	public static void main(String[] args) {
		System.out.println(Gender.MALE);  // .toString이 생략되어있음
		System.out.println(Gender.FEMAIL);
		System.out.println("--------------------------------");
		
		System.out.println(Gender.MALE.toString()); 
		System.out.println(Gender.FEMAIL.toString());
		
	}
}
