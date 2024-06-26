package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BookUserMain2 {
	private BufferedReader br;
	private BookDAO2 dao;
	private String me_id;	//로그인한 회원 아이디
	private boolean login;	//로그인 여부(로그인 true, 로그아웃 false)
	
	//생성자
	public BookUserMain2() {
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			dao = new BookDAO2();
			callMenu();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(br != null)try {br.close();} catch(IOException e) {}
		}
	}
	
	//메뉴
	public void callMenu() throws IOException{
		while(true) {
			System.out.print("1.로그인, 2.회원가입, 3.종료: ");
			try {
				  int no = Integer.parseInt(br.readLine());
				  if(no == 1) {//로그인
					  System.out.print("아이디: ");
					  me_id = br.readLine();
					  System.out.print("비밀번호: ");
					  String me_passwd = br.readLine();
					  
					  login = dao.loginCheck(me_id, me_passwd);
					  
					  if(login) {
						  System.out.println(me_id + "님 로그인 되었습니다.");
						  break;
					  }
					  	System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
				  }else if(no == 2) {//회원가입
					  
				  }else if(no == 3) {//종료
					  System.out.println("프로그램 종료");
					  break;
				  }else {
					  System.out.println("잘못 입력했습니다.");
				  }
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력 가능!!");
			}
		}
		
		
		
		//로그인 체크 후 메뉴
		while(login) {
			System.out.print("1.도서대출, 2.MY대출 목록, 3.대출 도서 반납, 4.종료: ");
			try {
					int no = Integer.parseInt(br.readLine());
					if(no == 1) {//도서 대출
						
					}else if(no == 2) {//MY대출 목록
						
					}else if(no == 3) {//대출 도서 반납
						
					}else if(no == 4) {//종료
						System.out.println("프로그램 종료합니다.");
						break;
					}else {
						System.out.println("잘못 입력했습니다.");
					}
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력 가능!!");
			}
		}
	}
	
	//메인 메서드
	public static void main(String[] args) {
		new BookUserMain2();
	}
}
