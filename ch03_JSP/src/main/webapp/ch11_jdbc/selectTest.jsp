<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kr.util.DBUtil" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 목록</title>
<link rel="stylesheet" href="../css/style.css" type="text/css">
</head>
<body class="page-main">
	<h2>상품 목록</h2>
	<div class="align-right">
		<input type="button" value="등록하기" onclick="location.href='insertTestForm.jsp'">
	</div>
<%
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql = null;
	
	try{
		//Connection 객체 반환
		conn = DBUtil.getConnection();
		
		//SQL문 작성
		sql = "SELECT * FROM product ORDER BY num DESC";
		
		//JDBC 수행 3단계
		pstmt = conn.prepareStatement(sql);
		
		//JDBC 수행 4단계
		rs = pstmt.executeQuery();
%>
	<table>
		<tr>
			<th>상품 번호</th>
			<th>상품명</th>
			<th>가격</th>
			<th>수량</th>
			<th>작성일</th>
		</tr>
<%
		while(rs.next()){
			int num = rs.getInt("num");
			String name = rs.getString("name");
			int price = rs.getInt("price");
			int stock = rs.getInt("stock");
			Date reg_date = rs.getDate("reg_date");
%>
	<tr>
		<td><%=num %></td>
		<td><a href="detailTest.jsp?num=<%=num %>"><%=name %></a></td>
		<td><%=price %></td>
		<td><%=stock %></td>	
		<td><%=reg_date %></td>
	</tr>
<%
	}
%>
	</table>
<%
	}catch(Exception e){
%>
	<div class="result-display">
		<span>오류 발생!</span>
	</div>
<%
		e.printStackTrace();
	}finally{
		DBUtil.executeClose(rs, pstmt, conn);
	}
%>
</body>
</html>