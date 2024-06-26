package kr.s21.object.util;

import java.util.StringTokenizer;

public class StringTokenizerMain02 {
	public static void main(String[] args) {
		String source = "2024-03-04 16:03:20";
		StringTokenizer st = new StringTokenizer(source,"- :"); 
								//구분자를 한 번에 다 넣을 수 있음 (하이푼, 공백, 콜론)
		
		while(st.hasMoreTokens()) {// 잘려진 문자열이 있는지 검증 
			System.out.println(st.nextToken());
		}
	}
}
