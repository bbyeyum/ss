package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BookAdminMain2 {
	private BufferedReader br;
	private BookDAO2 dao;
	
	//생성자
	public BookAdminMain2() {
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			dao = new BookDAO2();
			callMenu();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(br != null) try {br.close();} catch(IOException e) {}
		}
	}
	
	//메뉴
	public void callMenu() throws IOException{
		while(true) {
			System.out.println("1.도서등록, 2.도서목록, 3.회원목록, 4.대출목록, 5.종료: ");
			try {
				int no = Integer.parseInt(br.readLine());
				if(no == 1) {//도서 등록
					
				}else if(no == 2) {//도서 목록
					
				}else if(no == 3) {//회원 목록
					
				}else if(no == 4) {//대출 목록
					
				}else if(no == 5) {//종료
					System.out.println("프로그램 종료합니다.");
					break;
				}else {
					System.out.println("잘못 입력했습니다.");
				}
			}catch(NumberFormatException e) {
				System.out.println("숫자를 입력해주세요.");
			}
		}
	}
	
	//메인 메서드
	public static void main(String[] args) {
		new BookAdminMain2();
	}
}
