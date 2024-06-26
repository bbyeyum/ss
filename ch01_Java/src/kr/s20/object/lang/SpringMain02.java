package kr.s20.object.lang;

public class SpringMain02 {
	public static void main(String[] args) {
		String s1 = "Kwon Sun Ae";
				   //012345678910, 문자열 길이: 11
		
		int index = s1.indexOf('n');   // "Kwon Sun Ae" 문자열에서 맨처음 n의 위치를 찾는 메서드
		System.out.println("맨 처음 문자 n의 위치: " + index);
		
		index = s1.indexOf("Sun");     
		System.out.println("문자 Sun의 위치: " + index); 
		// "Kwon Sun Ae" 문자열에서 "Sun"의 위치는 인덱스 567 이지만
	    //  하나밖에 반환 못하기 때문에 "Sun"의 맨 앞자리 인덱스 5 하나만 반환된다.
		
		index = s1.lastIndexOf('n');  // "Kwon Sun Ae" 문자열에서 마지막 n의 위치를 찾는 메서드
		System.out.println("마지막 문자 n의 위치: " + index);
		
		char c = s1.charAt(7);      // "Kwon Sun Ae" 문자열에서 인덱스 7번 위치에 있는 문자를 추출하는 메서드
		System.out.println("지정한 인덱스의 문자 추출: " + c);
		
		index = s1.indexOf("S");  // "Kwon Sun Ae" 문자열에서 대문자 S의 위치는 5
		String str = s1.substring(index);  // 인덱스 5부터 끝까지 문자열 추출 → "S"부터 끝까지 추출
		System.out.println("대문자 S부터 끝까지 잘라내기: " + str);
		
		str = s1.substring(index, index + 3); // 인덱스 5부터 8까지 문자열 추출
		System.out.println("인덱스5 부터 인덱스8 전까지 문자열 추출: " + str);
		
		int length = s1.length();
		System.out.println("문자열의 길이: " + length);
		
		String[] array = s1.split(" ");  //구분자(공백)를 이용해서 문자열 잘라내기
		for(int i =0; i < array.length; i++) {
			System.out.println("array[" + i + "]: " + array[i]);
		}
	}
}
