<%@ page language="java" contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ page import="kr.spring.util.DBUtil" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%
	//전송된 데이터 인코딩 타입 지정
	request.setCharacterEncoding("utf-8");

	//전송된 데이터 반환
	String id = request.getParameter("id");
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql = null;
	
	try{
		//Connection 객체 반환
		conn = DBUtil.getConnection();
		
		//SQL문 작성
		sql = "SELECT id FROM people WHERE id=?";
		
		//JDBC 수행 3단계: PreparedStatement 객체 반환
		pstmt = conn.prepareStatement(sql);
		
		//?에 데이터 바인딩
		pstmt.setString(1, id);
		
		//JDBC 수행 4단계
		rs = pstmt.executeQuery();
		if(rs.next()){//행이 있으면 ?에 바인딩한 id가 이미 있다는 의미니까 중복
%>
		{"result":"idDuplicated"}			
<%
		}else{//행이 없으면 그 id는 중복이 안된다는거니까 사용 가능
%>
		{"result":"idNotFound"}
<%			
		}
	}catch(Exception e){
%>
		{"result":"failure"}
<%
		e.printStackTrace();
	}finally{
		DBUtil.executeClose(rs, pstmt, conn);
	}

%>