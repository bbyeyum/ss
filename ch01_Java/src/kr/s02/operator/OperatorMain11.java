package kr.s02.operator;

public class OperatorMain11 {
			public static void main(String[] args) {
			char ch = 'b';
			String str;
			
			//str = ch >= 65 && ch <= 90 ? "대문자임" : "대문자가 아님";
			str = ch >= 'A' && ch <= 'Z' ? "대문자임" : "대문자가 아님";
			
			System.out.println(ch + "=>" + str);
				
	}
}
