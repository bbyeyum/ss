package kr.s28.iostream;  //나 혼자 실습 진행한 것

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

public class MovieMain {

	ArrayList<Movie> list;
	BufferedReader br;

	//생성자
	public MovieMain() {
		list = new ArrayList<Movie>();
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

	//메뉴
	public void callMenu() throws IOException {
		while(true) {
			System.out.print("1.영화 정보 입력, 2.영화 정보 출력, 3.종료: ");
			try {
				int num = Integer.parseInt(br.readLine());
				if(num == 1) {//영화 정보 입력
					inputMovie();
					createFile();
				}else if(num == 2) {//영화 정보 출력
					printMovie();
					readFile();
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
		System.out.println("영화리스트: 총 영화 수(" + list.size() + ")");
		System.out.println("영화제목\t제작연도\t감독\t배우\t상영시간");
		System.out.println("-------------------------------");

		//확장 for 문을 이용한 요소의 출력
		for(Movie mo : list) {
			System.out.printf("%s\t", mo.getName());
			System.out.printf("%s\t", mo.getCreate_year());
			System.out.printf("%s\t", mo.getDirector());
			System.out.printf("%s\t", mo.getActor());
			System.out.printf("%d%n", mo.getTime());	
		}
	}

	//상영 시간 조건 체크
	public int parseInputData(String item)throws IOException{
		while(true) {
			System.out.print(item);
			try {
				int time = Integer.parseInt(br.readLine());
				if(time <= 0) {
					System.out.println("0보다 크게 입력하세요.");
					continue;
				}
				return time;
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력 가능");
			}
		}
	}

	//파일 생성
	public void createFile() throws IOException {
		FileWriter fw = null;
		try {
			//파일생성(덮어쓰기)
			//fw = new FileWriter("fileWriter.txt");

			//파일생성(이어쓰기)
			fw = new FileWriter("movie.txt", true);
			
			String message = "안녕하세요 FileWriter 테스트"; 
			fw.write(message);  //버퍼 출력
			fw.flush();

			System.out.println("파일을 생성하고 내용을 기술");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fw != null)try {fw.close();}catch(IOException e) {}
		}
	}

	//파일 읽기
	public void readFile() throws IOException {
		FileReader fr = null;
		int readChar;
		try {
			fr = new FileReader("movie.txt");
			//파일로부터 데이터를 한 문자씩 읽어들여 유니코드로 반환
			while((readChar = fr.read())!= -1) {
				System.out.print((char)readChar);
			} 
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fr != null)try {fr.close();} catch(IOException e) {}
		}
	}



	public static void main(String[] args) {
		new MovieMain();
		
	}
}
