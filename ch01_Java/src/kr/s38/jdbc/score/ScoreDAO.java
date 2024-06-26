package kr.s38.jdbc.score;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.util.DBUtil;

public class ScoreDAO {
	//성적 입력
	public void insertScore(String name, int korean, int english, int math, int sum, int avg, String grade ) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			
			//SQL문 작성
			sql = "INSERT INTO score (num, name, korean, english, math, sum, avg, grade, reg_date) "
					+ "VALUES(score_seq.nextval, ?, ?, ?, ?, ?, ?, ?, SYSDATE)";
			
			//JDBC 수행 3단계
			pstmt = conn.prepareStatement(sql);
			
			//?안에 데이터 바인딩
			pstmt.setString(1, name);
			pstmt.setInt(2, korean);
			pstmt.setInt(3, english);
			pstmt.setInt(4, math);
			pstmt.setInt(5, sum);
			pstmt.setInt(6, avg);
			pstmt.setString(7,grade);
			
			//JDBC 수행 4단계
			int count = pstmt.executeUpdate();
			System.out.println(count + "개의 행을 삽입했습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
	
	//목록 보기
	public void selectScore() {
		//번호, 이름, 총점, 평균, 등급
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			
			//SQL문 작성
			sql = "SELECT * FROM score ORDER BY num DESC";
			
			//JDBC 수행 3단계
			pstmt = conn.prepareStatement(sql);
			
			//JDBC 수행 4단계
			rs = pstmt.executeQuery();
			System.out.println("------------------------------------");
			if(rs.next()) {
				System.out.println("번호\t이름\t총점\t평균\t등급");
				do {
					System.out.print(rs.getInt("num"));
					System.out.print("\t");
					System.out.print(rs.getString("name"));
					System.out.print("\t");
					System.out.print(rs.getInt("sum"));
					System.out.print("\t");
					System.out.print(rs.getInt("avg"));
					System.out.print("\t");
					System.out.println(rs.getString("grade"));
				}while(rs.next());
			}else {
				System.out.println("표시할 데이터가 없습니다.");
			}	
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
	}
	
	//성적 상세 정보 보기
	public void selectDetailScore(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			
			//SQL문 작성
			sql = "SELECT * FROM score WHERE num = ?";
			
			//JDBC 수행3단계
			pstmt = conn.prepareStatement(sql);
			
			//?에 데이터 바인딩
			pstmt.setInt(1, num);
			
			//JDBC 수행4단계
			rs = pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("번호: " + rs.getInt("num"));
				System.out.println("이름: " + rs.getString("name"));
				System.out.println("국어: " + rs.getInt("korean"));
				System.out.println("영어: " + rs.getInt("english"));
				System.out.println("수학: " + rs.getInt("math"));
				System.out.println("총점: " + rs.getInt("sum"));
				System.out.println("평균: " + rs.getInt("avg"));
				System.out.println("등급: " + rs.getString("grade"));
				System.out.println("등록일: " + rs.getDate("reg_date"));
			}else {
				System.out.println("표시할 데이터가 없습니다.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
	}
	//내용 수정
	public void updateScore(int num, String name, int korean, int english, int math, int sum, int avg, String grade) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			//JDBC 수행 1,2단계 
			conn = DBUtil.getConnection();
			
			//SQL문 작성
			sql = "UPDATE score SET name=?, korean=?, english=?, math=?, sum=?, avg=?, grade=? WHERE num=?";
			
			//JDBC 수행3단계
			pstmt = conn.prepareStatement(sql);
			
			//?에 데이터 바인딩
			pstmt.setString(1, name);
			pstmt.setInt(2, korean);
			pstmt.setInt(3, english);
			pstmt.setInt(4, math);
			pstmt.setInt(5, sum);
			pstmt.setInt(6, avg);
			pstmt.setString(7, grade);
			pstmt.setInt(8, num);
			
			//JDBC 수행4단계
			int count = pstmt.executeUpdate();
			System.out.println(count + "개의 행을 수정하였습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
	//삭제
	public void deleteScore(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			//JDBC 수행 1,2 단계
			conn = DBUtil.getConnection();
			
			//SQL문 작성
			sql = "DELETE FROM score WHERE num=?";
			
			//JDBC 수행 3 단계
			pstmt = conn.prepareStatement(sql);
			
			//?에 데이터 바인딩
			pstmt.setInt(1, num);
			
			//JDBC 수행 4단계
			int count = pstmt.executeUpdate();
			System.out.println(count + "개의 행을 삭제했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
}
