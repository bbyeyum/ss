package kr.s27.collection;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableMain {
	public static void main(String[] args) {
		Hashtable<String,Object> h = new Hashtable<String,Object>();
		
		h.put("name", "홍길동");
		h.put("age", 27);
		h.put("tel", "010-1234-5678");
		h.put("job", "경찰");
		h.put("address", "서울");
		//key 가 중복되면 마지막에 입력한 값이 인정
		h.put("name", "홍길순");
		//key 와 value 에 null 넣으면 실행했을 때 오류가 발생함 , null 사용 불가
		//h.put(null, "프로그래머");
		//h.put("hobby", null);
		
		//저장된 데이터(key 와 value 의 쌍)의 목록
		System.out.println(h);
		System.out.println("-----------------------------------------------");
		
		//key 를 통해서 value 구하기
		String name = (String)h.get("name");
		Integer age = (Integer)h.get("age");
		System.out.println(name + ", " + age);
		System.out.println("-----------------------------------------------");
		
		//Enumeration 을 이용해서 key 구하기
		Enumeration<String> en = h.keys();
		while(en.hasMoreElements()) {
			String key = en.nextElement();
			System.out.println(key + ", " + h.get(key));
		}
	}
}
