package kr.s21.object.util;


import java.util.Calendar;

public class CalendarMain01 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance(); //객체 생성할 때 기존 방식인 new가 아닌 getInstance가 붙음
		System.out.println(today);
		
		int year = today.get(Calendar.YEAR);  //연도 
		int month = today.get(Calendar.MONTH)+ 1; //월  +1을 하지 않으면 기본값이 0 ~ 11월로 측정됨
		int date = today.get(Calendar.DATE); //일
		
		System.out.printf("%d년%d월%d일 ", year, month, date);
	
		int day = today.get(Calendar.DAY_OF_WEEK);  //요일 1 ~ 7일   -1을 하지 않으면 기본 값이 1 ~ 7로 측정됨
		String [] days = {"일", "월", "화", "수", "목", "금", "토"};
		
		System.out.print(days[day-1] + "요일");
		
		int amPm = today.get(Calendar.AM_PM); // 오전 0, 오후1
		String str = amPm == Calendar.AM ? "오전" : "오후";
		
		int hour = today.get(Calendar.HOUR); //시 HOUR_OF_DAY(24시 표시)
		int min = today.get(Calendar.MINUTE); //분
		int sec = today.get(Calendar.SECOND); //초
		
		System.out.printf(" %s %d시%d분%d초", str, hour, min, sec);
		
		
	}
}
