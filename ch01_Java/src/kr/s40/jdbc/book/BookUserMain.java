package kr.s40.jdbc.book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BookUserMain {
	private BufferedReader br;
	private BookDAO dao;
	private String me_id;  //로그인한 회원 아이디
	private boolean login; //로그인 여부(로그인 true, 로그아웃 false)
	
	//생성자
	public BookUserMain() {
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			dao = new BookDAO();
			
			//메뉴호출
			callMenu();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리 
			if(br != null) try {br.close();} catch(IOException e) {}
		}
	}
	
	//메뉴
	public void callMenu() throws IOException{
		//로그인 체크
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
					System.out.println("아이디 또는 비밀번호가 불일치합니다.");
				}else if(no == 2) {//회원가입
					System.out.print("아이디: ");
					String me_id = br.readLine();
					//아이디 중복 체크
					
					int check = dao.checkId(me_id);
					if(check >= 1) {//1:중복, 2:오류
						System.out.println("중복된 아이디입니다.");
					}else {//0: 미중복
						System.out.print("비밀번호: ");
						String me_passwd = br.readLine();
						System.out.print("회원명: ");
						String me_name = br.readLine();
						System.out.print("전화번호: ");
						String me_phone = br.readLine();
						dao.insertMember(me_id, me_passwd, me_name, me_phone);
					}
				}else if(no == 3) {//종료
					System.out.println("프로그램 종료");
					break;
				}else {
					System.out.println("잘못 입력했습니다.");
				}
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력 가능!");
			}
		}
		
		//로그인 체크 후 메뉴
		while(login) {
			System.out.print("1.도서대출, 2.MY대출 목록, 3.대출 도서 반납, 4.종료: ");
			try {
				int no = Integer.parseInt(br.readLine());
				if(no == 1) {//도서대출
					System.out.print("대출하실 도서번호: ");
					int bk_num = Integer.parseInt(br.readLine());
					//도서 대출 가능 여부 
					
					int check = dao.getStatisReservation(bk_num);
					if(check >= 1) {
						System.out.println("이미 대출 중입니다.");
					}else {
						System.out.println("대출 가능한 책입니다.");
						dao.insertReservation(bk_num, me_id);
					}
				}else if(no == 2) {//MY대출 목록
					dao.selectMyList(me_id);
				}else if(no == 3) {//대출 도서 반납
					dao.selectMyList(me_id);
					System.out.print("반납하실 책의 대출 번호: ");
					int re_num = Integer.parseInt(br.readLine());
					//도서 반납 가능 여부
				
					int check = dao.getStatusBck(re_num, me_id);
					if(check == 1) {
						System.out.println("반납이 가능합니다.");
						dao.updateReservation(re_num);
					} else {
						System.out.println("반납이 불가능합니다.");
					}
				}else if(no == 4) {//종료
					System.out.println("프로그램 종료");
					break;
				}else {
					System.out.println("잘못 입력했습니다.");
				}
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력 가능!!");
			}
		}
	}
	
	public static void main(String[] args) {
		new BookUserMain();
	}
}
