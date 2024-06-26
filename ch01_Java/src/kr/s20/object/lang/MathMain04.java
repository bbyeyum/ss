package kr.s20.object.lang;

import java.util.Arrays;

public class MathMain04 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 로또 프로그램 제작
		 * 길이가 6인 int형 배열을 생성하고 1 ~ 45 숫자 범위로 난수를 구함.
		 * 중복되지 않는 6개의 숫자를 생성해서 배열에 저장하고 출력하시오.
		 * 난수 생성: Math.random() 또는 Random 클래스의 nextInt() 메서드 사용
		 */
		
		int[] lotto = new int[6];
		
		System.out.print("로또 번호: ");
		for(int i = 0; i < lotto.length; i++) {
			double ran = Math.random();
			int index = (int)(ran* 45) + 1;
			lotto[i] = index;
			
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lotto);  //오름차순으로 정렬
		for(int num : lotto) {
			System.out.print(num + " ");
		}
	}
	
}
