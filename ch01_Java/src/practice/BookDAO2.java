package practice;

public class BookDAO2 {
	//관리자 도서 등록
	public void insertBook(String bk_name, String bk_category) {
		
	}
	
	//관리자 도서 목록 보기
	public void selectBook(){
		
	}

	//관리자 회원 목록 보기
	public void selectListMember() {
		
	}
	
	//관리자 대출 목록 보기(대출 및 반납의 모든 데이터 표시)
	public void selectListReservation() {
		
	}
	
	//사용자 아이디 중복 체크(count가 0이면 중복x, count가 1이면 중복)
	public int checkId(String me_id) {
		int count = 0;
		
		return count;
		
	}
	
	//사용자 회원 가입
	public void insertMember(String me_id, String me_passwd, String me_name, String me_phone) {
		
	}
	
	//사용자 로그인 체크
	public boolean loginCheck(String me_id, String me_passwd) {
		boolean flag = false;
		
		return flag;
	}
	
	//도서 대출 여부 확인(도서번호(bk_num)로 검색해서 re_status의 값이 0이면 대출 가능, 1이면 대출 불가능)
	public int getStatisReservation(int bk_num) {
		int count = 0;
		
		return count;
	}
	
	//도서 대출 등록
	public void insertReservation(int bk_num, String me_id) {
		
	}
	
	//사용자 MY 대출 목록 보기(현재 대출한 목록만 표시)
	public void selectMyList(String me_id) {
		
	}
	
	//사용자 반납 가능 여부(대출번호(re_num)와 회원아이디(me_id)를 함께 조회해서 re_status가 1인 것은 반납 가능 re_status가 0이면 반납 불가능)
	public int getStatusBck(int re_num, String me_id) {
		int count = 0;
		
		return count;
	}
	
	//사용자 반납 처리
	public void updateReservation(int re_num) {
		
	}
}
