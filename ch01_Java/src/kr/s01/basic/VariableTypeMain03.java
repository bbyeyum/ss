package kr.s01.basic;

public class VariableTypeMain03 {
				public static void main(String [] args) {
					System.out.println("===묵시적 형변환(자동 형변환)===");
					//더 큰 자료형으로 승격이 일어나는 형태, 정보의 손실이 전혀 없으며 자동적으로 발생 
					
					byte b1 = 127;  
					byte b2 = 127;
					//32bit 미만 byte형 데이터를 연산하면 자동으로 32bit로 변환
					int result =b1 + b2;
					System.out.println("result = " + result);
					
					short s1 = 32767;
					short s2 = 32767;
					////32bit 미만 short형 데이터를 연산하면 자동으로 32bit로 변환
					int result2 = s1 + s2;
					System.out.println("result2 = " + result2);
					
					int in1 = 1234;
					long lg1 = 5678L;
									//in1 : int 타입이 long으로 자동 형변환됨
					long result3 = in1 + lg1;
					System.out.println("result3 = " + result3);
					
					
					int in2 = 245;
					double du1 = 98.2;
									//in1 : int 타입이 double으로 자동 형변환됨
					double result4 = in2 + du1;
					System.out.println("result4 = " + result4);
					
				}
}