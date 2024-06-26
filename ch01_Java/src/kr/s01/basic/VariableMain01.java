package kr.s01.basic;

public class VariableMain01 {
				public static void main(String [] args) {
					//변수(Variable)는 값을 저장할 수 있는 메모리의 공간
					//변수 선언
					int num;
					
					//변수의 초기화
					num = 17;
					
					//변수의 값 출력
					System.out.println(num);
					
					
					System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
					
					//변수 선언, 초기화 같이 
					int number = 20;
					//출력
					System.out.println(number);

					//데이터 변경
					number = 40;
					//출력
					System.out.println(number);
					
					
					//[주의사항]
					//동일한 변수명으로 변수를 선언하면 오류 발생
					//int number = 30; 
					
					System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
					
					//동일한 자료형을 사용하기 때문에 두번째 변수명 앞의 자료형은 생략함.
					int a = 10, b = 20;
					int result = a + b;
					
					//출력
					System.out.printf("result = %d%n", result);
					
					//[상황에 따른 + 의 기능]
					//숫자 + 숫자 → 연산
					//문자열 + 숫자 → 연결
					//숫자 + 문자열 → 연결
					//문자열 + 문자열 → 연결
					
					
					System.out.println("result = " + result);
					
					//주의사항
				    System.out.println("결과 : " + a + b);
				    System.out.println("결과 : " + (a + b));
				    
				    //변수 선언
				    //int no;
				    //System.out.println(no);
				    //변수 선언 후 출력 또는 연산하기 전에 반드시 초기화를 해야 한다.
				    
	}
}