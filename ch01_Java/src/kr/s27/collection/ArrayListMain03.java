package kr.s27.collection;

import java.util.ArrayList;

public class ArrayListMain03 {
	public static void main(String[] args) {
		//중간에 다른 타입이 저장된 경우
		//제네릭 표현: 객체를 생성할 때 객체에 저장할 수 있는 요소의 타입을 지정
	
		ArrayList<String> list = new ArrayList<String>();
		list.add("장영실");   //기존에는 String 타입이 리스트에 저장될 때 Object 타입으로 변환되었으나
		list.add("홍길동");	//제네릭 표현으로 String 을 지정했기 때문에 String 타입으로 리스트에 저장된다.
		//list.add(1000);   //객체에 저장할 수 있는 데이터의 타입을 String 으로 한정했기 때문에 Integer 데이터 저장 불가
		list.add("김유신");
		
		//반복문을 이용한 요소 출력
		for(int i = 0; i < list.size(); i++) {
			String name = list.get(i);    //기존에는 Object 타입에서 String 타입으로 다운캐스팅했었지만
			System.out.println(name);	  //제네릭표현으로 String 타입으로 리스트에 저장되었기에 출력할 때
										  //다운캐스팅을 할 필요가 없음
		}
		System.out.println("---------------------------------");
		
		//확장 for 문을 이용한 요소 출력
		for(String name : list) {
			System.out.println(name);
		}
		
	}
}
