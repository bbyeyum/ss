package kr.s27.collection;

import java.util.ArrayList;

public class ArrayListMain02 {
	public static void main(String[] args) {
		/*
		 * list 구조의 특징
		 * 저장된 순서 유지, 중복 저장 허용 
		 */
		ArrayList list = new ArrayList();
		list.add("홍길동");  //String 타입이 리스트에 저장되면서 Object 타입으로 변환된다.
		list.add("장영실");  //배열도 그렇고 리스트도 같은 타입끼리 묶기 때문에 Object 타입으로 변환되는 것
		list.add("박문수");  // 그래서 리스트에서 다시 꺼내려면 Object 타입에서 다운캐스팅해서 꺼내야 한다.
		list.add("김유신");
		
		//저장된 요소의 목록
		System.out.println(list);
		System.out.println("-------------------------------------------");
		//반복문을 이용해서 저장된 요소 출력
		for(int i = 0; i < list.size(); i++) {
			String name = (String)list.get(i);    //다운캐스팅
			System.out.println(name);
		}
	}
}
