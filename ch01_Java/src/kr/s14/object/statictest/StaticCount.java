package kr.s14.object.statictest;

public class StaticCount {
	//인스턴스 변수: 객체가 생성될 때 객체에 포함되는 변수
	int c;
	
	//static(클래스) 변수: 객체 생성과 무관, 객체에 포함되지 않음
	//호출하면 static 영역 메모리에 올라감
	static int count;
	
	//생성자
	
	public StaticCount() {
		c++;
		count++; //static 변수를 호출할 때는 앞에 클래스명을 붙여서 호출해야함 
				 //← 옆의 count 같은 경우에는 같은 클래스기 때문에 클래스명 생략)
	}
}
