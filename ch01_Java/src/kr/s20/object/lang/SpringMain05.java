package kr.s20.object.lang;

public class SpringMain05 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 아래 문자열의 대문자 → 소문자 , 소문자 → 대문자
		 */
		String str = "abcMDye-4W?EWzz";
		String result = "";
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
				 //charAt 로 문자열을 문자 한개씩으로 나눠줌
			if((65 <= c ) && (c <= 90)) {
				result += String.valueOf(c).toLowerCase();	
                 //toLowerCase는 String 타입에서만 사용 가능해서 char 에서 
			     // String.valueOf 이용하여 다시 String 으로 변환하는 것
			}else if((97 <= c ) && (c <= 122)) {
				result += String.valueOf(c).toUpperCase();
				//toUpperCase는 String 타입에서만 사용 가능해서 char 에서 
				// String.valueOf 이용하여 다시 String 으로 변환하는 것
			}else {
				result += c;
			}
		}
		System.out.println("변환된 문자열: " + result);
		System.out.println("-----------------------------------------------------------");
		
		String result2 = "";
							//String → char[]
		for(char c : str.toCharArray()) {
			//대문자이면 true
			if(Character.isUpperCase(c)) {
							//소문자로 변환
				result2 += Character.toLowerCase(c);
							//소문자이면 true
			}else if(Character.isLowerCase(c)) {
							//대문자로 변환
				result2 += Character.toUpperCase(c);
			}else {
				result2 += c;
			}
		}
		System.out.println("변환된 문자열: " + result2);
		System.out.println("-----------------------------------------------------------");
		
		String result3 = "";
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if((65 <= c ) && (c <= 90)) { //대문자
				result3 += (char)(c + 32);
			}else if((97 <= c ) && (c <= 122)) { //소문자
				result3 += (char)(c - 32);
			}else {
				result3 += c;
			}
		}
		System.out.println("변환된 문자열: " + result3);
	}
}
