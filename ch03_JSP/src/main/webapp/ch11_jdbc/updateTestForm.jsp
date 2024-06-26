<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kr.spring.util.DBUtil" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 정보 수정</title>
<link rel="stylesheet" href="../css/style.css" type="text/css">
<script type="text/javascript" src="script.js"></script>
</head>
<body>
	<div class="page-main">
		<h2>상품 정보 수정</h2>
<%
	int num = Integer.parseInt(request.getParameter("num"));
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql = null;
	
	try{
		conn = DBUtil.getConnection();
		sql = "SELECT * FROM product WHERE num = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, num);
		rs = pstmt.executeQuery();
		
		if(rs.next()){
			String name = rs.getString("name");
			int price = rs.getInt("price");
			int stock = rs.getInt("stock");
			String origin = rs.getString("origin");
%>
		<form id="myForm" action="updateTest.jsp" method="post">
			<input type="hidden" name="num" value="<%=num %>">
			<ul>
				<li>
					<label for="name">상품명</label>
					<input type="text" name="name" id="name" size="20" maxlength="10" value="<%=name%>"> 
				</li>
				<li>
					 <label for="price">가격</label>
					 <input type="number" name="price" id="price" size="30" maxlength="10" value="<%=price%>">
				</li>
				<li>
					<label for="stock">수량</label>
					<input type="number" name="stock" id="stock" size="20" maxlength="10" value="<%=stock%>">
				</li>
				<li>
					<label for="origin">원산지</label>
					<input type="text" name="origin" id="origin" size="20" maxlength="10" value="<%=origin%>">
				</li>
			</ul>
			<div class="align-center">
				<input type="submit" value="수정">
				<input type="button" value="목록" onclick="location.href='selectTest.jsp'">
			</div>
		</form>
<%	
		}else{
%>			
	<div class="result-display">
		<div class="align-center">
			오류 발생! 수정할 상품 정보 호출 실패!<p>
			<input type="button" value="목록" onclick="location.href='selectTest.jsp'">
		</div>
	</div>
<%
		}
	}catch(Exception e){
%>
	<div class="result-display">
		<div class="align-center">
			오류 발생! 수정할 상품 정보 호출 실패!<p>
			<input type="button" value="목록" onclick="location.href='selectTest.jsp'">
		</div>
	</div> 
<%
		e.printStackTrace();
	}finally{
		DBUtil.executeClose(rs, pstmt, conn);
	}
%>
	</div>
</body>
</html>