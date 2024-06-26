package kr.s07.object.method;   //동일한 파일 내에 클래스를 여러 개 생성할 수 있음
								//여러 개 생성할 수 있으나 메인 메서드가 속한 메인 클래스는 1개만 가능
							 	// 부 클래스들은 앞에 public 없이 class a ~ 로 시작한다.


class Tv{
	//멤버 필드(속성)
	boolean power; //전원상태(on/off)
	int channel;   //채널
	
	//멤버 메서드(동작) 
	public void isPower() {//TV를 켜거나 끄는 기능을 수행하는 메서드
		power = !power;
	}
	public void channelUp() {//TV 채널을 높이는 기능을 수행하는 메서드
		++channel;
	}
	public void channelDown() {//TV 채널을 낮추는 기능을 수행하는 메서드
		--channel;
	}
}


public class TvMain {
	public static void main(String[] args) {
		Tv t = new Tv();
		t.isPower();   //power의 값은 false → true
		System.out.println("TV 실행 여부: " + t.power);
		System.out.println("현재 채널: " + t.channel);
		System.out.println("---------------------");
		
		t.channel = 7;
		System.out.println("첫번째 변경된 채널: " + t.channel);
		System.out.println("---------------------");
		
		t.channelDown();
		System.out.println("두번째 변경된 채널: " + t.channel);
		System.out.println("---------------------");
		
		//TV 전원 끄기
		t.isPower();  //true → false
		System.out.println("TV 실행 여부: " + t.power);
	}
}
