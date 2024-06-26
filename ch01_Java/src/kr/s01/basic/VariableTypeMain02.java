package kr.s01.basic;

public class VariableTypeMain02 {
		public static void main(String [] args) {
			//확장 특수 출력 문자(escape sequence)
			char single = '\'';   // 앞에 \역슬래쉬를 넣어주면 '가 특수문자에서 일반문자로 변환된다.
			System.out.println(single);
			
			
			String str = "오늘은 \"월요일\"입니다."; // 앞에 \역슬래쉬를 넣어주면 "가 특수문자에서 일반문자로 변환된다.
			System.out.println(str);
			
			//문자열에 '를 표시하면 자동으로 일반문자로 변환됨 ( 따로 \ 넣을 필요가 없다.)
			String str2 = "오늘은 '서울'에 비가 와요!";  
			System.out.println(str2);
			
			//String str3 = C:\javaWork\program\eclipse  → \하나만 있으면 특수문자로 취급되어 오류 발생 \하나 더 붙여야 일반문자로 변환된다.
			String str3 = "C:\\javaWork\\program\\eclipse";
			System.out.println(str3);
			
			String str4 = "오늘은 월요일\n내일은 화요일";     // \n은 줄바꿈 
			System.out.println(str4);
			
			String str5 = "이름\t나이\t취미";             // \t는 적당한 띄어쓰기 
			System.out.println(str5);
			
		}
}
