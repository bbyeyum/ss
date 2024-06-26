package kr.s28.iostream;  //강사님이 풀어주신 것

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 메뉴: 1.영화정보입력, 2.영화정보출력, 3.파일생성, 4.파일읽기, 5.종료
 * 메서드명:  메뉴 callMenu()
 * 		  영화정보 입력 inputMovie()
 *        영화정보 출력 printMovie()
 *        파일 생성 createFile()
 *        파일 읽기 readFile() 
 *        
 * 입력 시 조건 체크: 상영 시간 0보다 크게 입력하세요.
 */

public class MovieMain2 {

	ArrayList<Movie> list;
	BufferedReader br;

	//생성자
	public MovieMain2() {
		list = new ArrayList<Movie>();
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			callMenu();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	}

	//메뉴
	public void callMenu() throws IOException {
		while(true) {
			System.out.print("1.영화정보 입력, 2.영화정보 출력, 3.파일생성, 4.파일읽기, 5.종료 ");     // 파일 생성, 읽는 것을 메뉴 추가해서 작성함 
			try {
				int num = Integer.parseInt(br.readLine());                    
				if(num == 1) {//영화 정보 입력
					inputMovie();
				}else if(num == 2) {//영화 정보 출력
					printMovie();
				}else if(num == 3) {//파일 생성
					createFile();
				}else if(num == 4) {//파일 읽기
					readFile();
				}else if(num == 5) {//종료
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

	//영화정보 입력
	public void inputMovie() throws IOException {
		Movie m = new Movie();
		System.out.print("영화 제목: ");
		m.setName(br.readLine());
		System.out.print("제작 연도: ");
		m.setCreate_year(br.readLine());
		System.out.print("감독: ");
		m.setDirector(br.readLine());
		System.out.print("배우: ");
		m.setActor(br.readLine());
		                                 
		m.setTime(parseInputData("상영 시간: "));	

		//Movie 객체 를 ArrayList에 저장
		list.add(m);
		System.out.println("영화 정보 1건이 추가되었습니다.");
	}

	//영화정보 출력
	public void printMovie() throws IOException {
		if(list.size() > 0) {											//영화정보가 없을 때 출력 정보 없게 하는 법
		System.out.println("-------------------------------------------------");
		System.out.println("영화제목\t제작연도\t감독\t배우\t상영시간");
		System.out.println("-------------------------------------------------");

		//확장 for 문을 이용한 요소의 출력
		for(Movie m : list) {
			System.out.print(m.toString());                             //toString 메서드 재정의해서 코드 줄임
		}
		}else {
			System.out.println("출력할 영화정보가 없습니다.");					//영화 정보 저장 안되어 있으면 ← 출력됨 
		}
	}

	//상영 시간 조건 체크
	public int parseInputData(String time)throws IOException{
		while(true) {
			System.out.print(time);
			try {
				int num = Integer.parseInt(br.readLine());
				if(num <= 0) {
					System.out.println("0보다 크게 입력하세요.");
					continue;
				}
				return num;
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력 가능");
			}
		}
	}

	//파일 생성
	public void createFile(){                                      //             혼자서 못한 부분!!!!!
		FileWriter fw = null;
		try {
			fw = new FileWriter("movie.txt");
			fw.write("-----------------------------------------------\n");
			fw.write("영화제목\t제작연도\t감독\t배우\t상영시간\n");
			fw.write("-----------------------------------------------\n");
			for(Movie m : list) {
				fw.write(m.toString());
			}
			fw.flush();
			System.out.println("파일에 영화정보를 저장했습니다.");
			
		}catch(IOException e) {
			System.out.println("파일에 영화 정보 저장 오류");
		}finally {
			if(fw != null)try {fw.close();}catch(IOException e) {}
		}
	}

	//파일 읽기
	public void readFile(){                                      //             혼자서 못한 부분!!!!!
		FileReader fr = null;
		int readChar;
		try {
			fr = new FileReader("movie.txt");
			while((readChar = fr.read()) != -1) {
				System.out.print((char)readChar);
			}
		}catch(FileNotFoundException e) {
			System.out.println("영화 파일을 찾을 수 없습니다.");
		}catch(IOException e) {
			System.out.println("파일 읽기 오류");
		}finally {
			if(fr != null)try {fr.close();} catch(IOException e) {}
		}
	}



	public static void main(String[] args) {
		new MovieMain2();
		
	}
}