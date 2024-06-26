package kr.s01.basic;

public class VariableTypeMain04 {
		public static void main(String [] args) {
			System.out.println("===명시적 형변환(강제 형변환)===");
			//더 작은 자료형으로 강등이 일어나는 형태, 정보의 손실이 발생할 수 있음.
			byte b1 = 127;
			byte b2 = 127;
			byte result = (byte) (b1 + b2);
			System.out.println(result);
			
			short s1 = 32767;
			short s2 = 32767;
			short result2 = (short) (s1 + s2);
			System.out.println(result2);
			
			float f1 = 3.14f;
			int in1 = 15;
			int result3 = (int)(f1 + in1);
			System.out.println(result3);
			
			long lg1 = 1234L;
			int in2 = 59;
			int result4 = (int)(lg1 + in2);
			System.out.println(result4);
			
		}
}
