package kr.s27.collection;
/*
 * [실습]
 * 메뉴: 1.회원정보 입력, 2.회원정보 출력, 3.종료
 * 메서드명: 메뉴 callMenu()
 * 		  회원정보 입력 register()
 * 		  회원정보 출력 printUserInfo()
 * 
 * 입력 시 조건 체크: 나이는 1살 이상 입력 가능 
 */

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class MemberMain {
	
	ArrayList<Member> list;
	BufferedReader br;
	
	public MemberMain() {
		list = new ArrayList<Member>();
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
				System.out.print("1.회원정보 입력, 2.회원정보 출력, 3.종료: ");
				try {
					int num = Integer.parseInt(br.readLine());
					if(num == 1) {//회원정보 입력
						register();
					}else if(num == 2) {//회원정보 출력
						printUserInfo();
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
		//회원 정보 입력
		public void register() throws IOException{
			Member p = new Member();
			System.out.print("이름: ");
			p.setName(br.readLine());
			
			p.setAge(parseInputData("나이: "));	
			
			System.out.print("직업: ");
			p.setJob(br.readLine());
			System.out.print("주소: ");
			p.setAddress(br.readLine());
			System.out.print("전화번호: ");
			p.setPhone(br.readLine());
			//Member 객체 를 ArrayList에 저장
			list.add(p);
			System.out.println("상품 정보 1건이 추가되었습니다.");
		}
		
		//나이 조건 체크
		public int parseInputData(String item)throws IOException{
			while(true) {
				System.out.print(item);
				try {
					int age = Integer.parseInt(br.readLine());
					if(age <= 0) {
						System.out.println("나이는 1살이상 입력 가능");
						continue;
					}
					return age;
				}catch(NumberFormatException e) {
					System.out.println("숫자만 입력 가능");
				}
			}
		}
		
		//회원 정보 출력
		public void printUserInfo(){
			System.out.println("회원리스트: 총 회원수(" + list.size() + ")");
			System.out.println("이름\t나이\t직업\t주소\t전화번호");
			System.out.println("-------------------------------");
			//반복문을 이용한 요소의 출력
//			for(int i = 0; i < list.size(); i++) {
//				Product pt = list.get(i);
//				System.out.printf("%s\t", pt.getName());
//				System.out.printf("%s\t", pt.getNum());
//				System.out.printf("%,d원\t", pt.getPrice());
//				System.out.printf("%s\t", pt.getMaker());
//				System.out.printf("%,d%n", pt.getStock());
//				
//			}
			//확장 for 문을 이용한 요소의 출력
			for(Member pt : list) {
				System.out.printf("%s\t", pt.getName());
				System.out.printf("%d\t", pt.getAge());
				System.out.printf("%s\t", pt.getJob());
				System.out.printf("%s\t", pt.getAddress());
			    System.out.printf("%s%n", pt.getPhone());	
			}
			
		}
		
	public static void main(String[] args) {
		new MemberMain();
	}
}
