package kr.s27.collection;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
 * [실습]
 * 메뉴: 1.성적입력, 2.성적출력, 3.종료
 * 		성적입력 inputScore()
 * 		성적출력 printScore()
 * 
 * 입력 시 조건 체크: 0부터 100까지만 입력 가능 
 */
public class ScoreMain {

	ArrayList<Score> list;
	BufferedReader br;

	public ScoreMain() {
		list = new ArrayList<Score>();
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			callMenu();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(br!=null)try {br.close();}catch(IOException e) {
			}
		}
	}

	//메뉴 호출
	public void callMenu()throws IOException{
		while(true) {
			System.out.print("1.성적 입력, 2.성적 출력, 3.종료: ");
			try {
				int num = Integer.parseInt(br.readLine());
				if(num == 1) {//성적 입력
					inputScore();
				}else if(num == 2) {//성적 출력
					printScore();
				}else if(num == 3) {//종료
					System.out.println("프로그램 종료");
					break;
				}else {
					System.out.println("잘못 입력했습니다.");
				}
			}catch(NumberFormatException e) {
				System.out.println("숫자만 허용!");
			}
		}
	}

	//성적 정보 입력
	public void inputScore() throws IOException{
		Score s = new Score();
		System.out.print("이름: ");
		s.setName(br.readLine());
		
		s.setKorean(parseInputData("국어: "));
		s.setEnglish(parseInputData("영어: "));
		s.setMath(parseInputData("수학: "));
		
		
		//Score 객체 를 ArrayList에 저장
		list.add(s);
	}

	//성적 조건 체크
	public int parseInputData(String course)throws IOException{
		while(true) {
			System.out.print(course);
			try {
				int num = Integer.parseInt(br.readLine());
				if(num < 0 || num > 100) {
					throw new ScoreValueException("0부터 100까지 입력 가능");
				}
				return num;
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력 가능");
			}catch(ScoreValueException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	//성적 정보 출력
	public void printScore(){
		System.out.println("------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println("------------------------------------------------");

		//확장 for 문을 이용한 요소의 출력
		for(Score s : list) {
			System.out.print(s.getName()+ "\t");
			System.out.print(s.getKorean()+ "\t");
			System.out.print(s.getEnglish()+ "\t");
			System.out.print(s.getMath()+ "\t");	
			System.out.print(s.makeSum()+ "\t");
			System.out.print(s.makeAvg()+ "\t");
			System.out.println(s.makeGrade());
			
		}

	}

	public static void main(String[] args) {
		new ScoreMain();
	}
}
