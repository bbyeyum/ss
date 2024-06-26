package kr.s27.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMain01 {
	public static void main(String[] args) {
		//HashSet : 중복값 저장이 안됨
		String [] array = {"Java", "JSP", "Java", "Oracle"};
		
		HashSet<String> hs = new HashSet<String>();
		for(String n : array) {
			hs.add(n); // Java 데이터 같은 경우 중복되기 때문에 처음 Java 하나만 저장되며 나머지는 저장하지 않는다.
		}
		//저장된 요소의 목록
		System.out.println(hs);
		System.out.println("------------------------------");
		
		//저장된 요소의 출력
		Iterator<String> ir = hs.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		System.out.println("------------------------------");
		
		for(String s : hs) {
			System.out.println(s);
		}
		
	}
}
