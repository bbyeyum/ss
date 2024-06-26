package kr.s27.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMain07 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 로또 프로그램 제작
		 * 1 ~ 45 까지 중복되지 않는 6개의 숫자를 구해서 ArrayList에 저장하고 출력하시오.
		 * 출력할 때는 오름차순 정렬하여 출력하시오.
		 * 난수 생성: Math.random() , Random 클래스의 nextInt() 메서드 사용
		 */
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 6; i++) {
			int num = (int)(Math.random() * 45 + 1);
			if(!list.contains(num)) {
				list.add(num);
			} 
		}
		Collections.sort(list);
		System.out.println("이번 주 로또 번호 : " + list);
	}
}
