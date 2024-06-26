package kr.s32.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import kr.util.DBUtil;

public class InsertMain {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			//JDBC 수행 1,2 단계
			conn = DBUtil.getConnection();
			
			//SQL문 작성
			sql = "INSERT INTO test2(id, name, age, reg_date) VALUES(?, ?, ?, SYSDATE)";
			
			//JDBC 수행 3 단계: PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql); // ← PreparedStatement 는 여기에 sql 들어감
			
			// ?에 데이터를 전달
			pstmt.setString(1, "she'g");  // 1번 ?에 데이터 전달
			pstmt.setString(2, "김연아");  // 2번 ?에 데이터 전달
			pstmt.setInt(3, 30);         // 3번 ?에 데이터 전달
			
			//JDBC 수행 4 단계: SQL문을 실행해서 테이블에 행을 추가 
			int count = pstmt.executeUpdate();  // ← PreparedStatement 는 여기에 sql 안들어감 
			System.out.println(count + "개 행을 추가했습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
}
