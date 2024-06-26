package kr.s27.collection;
import java.util.ArrayList;

class A{
	@Override
	public String toString() {
		return "A";
	}
}
class B{}

public class ArrayListMain01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//ArrayList에 객체 저장하기 (객체만 저장 가능)
		list.add(new A());
		list.add(new B());
		list.add("홍길동");
		list.add(10); //int → Integer (auto boxing)
		
		//저장된 요소의 목록
		System.out.println(list);
		
		//요소의 개수
		System.out.println(list.size());
	}
}
