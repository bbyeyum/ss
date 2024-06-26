package kr.s27.collection;

import java.util.ArrayList;

public class ArrayListMain04 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); 
		list.add("홍길동");
		list.add("김유신");
		list.add("박문수");
		list.add("장영실");
		list.add("홍길동");
		
		//반복문을 이용한 요소 출력
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}
		System.out.println("----------------------------------");
		
		//문자열 요소 삭제
		list.remove(2); // 인덱스 2번에 있는 요소 삭제 
		list.remove("홍길동"); //요소 자체를 직접 지정해서 삭제, 중복된 데이터일 경우 앞에 있는 데이터만 삭제
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}
		System.out.println("----------------------------------");
		
		
		
		
		ArrayList<Integer>list2 = new ArrayList<Integer>();
		list2.add(40);
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(40);
		
		for(int i = 0; i < list2.size(); i++) {
			System.out.println(i + ":" + list2.get(i));
		}
		System.out.println("----------------------------------");
		
		//숫자 요소의 삭제
		list2.remove(2); // 인덱스 2번에 있는 요소 삭제 
		list2.remove(Integer.valueOf(40)); // 요소로 직접 지정하여 삭제하려면 Intger 로 변환하여 삭제해야 한다. 
										   // 중복된 데이터일 경우 앞에 있는 데이터만 삭제
		for(int i = 0; i < list2.size(); i++) {
			System.out.println(i + ":" + list2.get(i));
		}
		System.out.println("----------------------------------");
		
		
		//요소의 변경
			//  인덱스, 데이터
		list2.set(1, 30);           // 인덱스 1번 위치에 있는 데이터를 30으로 변경한다.
		for(int i = 0; i < list2.size(); i++) {
			System.out.println(i + ":" + list2.get(i));
		}
		System.out.println("----------------------------------");
		
	}
}
