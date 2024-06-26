<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원 관리 메인</title>
<link rel="stylesheet" href="<%= request.getContextPath() %>/css/style.css" type="text/css">
</head>
<body>
<% 
	String user_id = (String)session.getAttribute("user_id");
%>
	<div class="page-main">
		<h1>사원관리 메인</h1>
		<a href="list.jsp">사원이야기</a>
		<div class="align-right">
<%
		if(user_id == null){//로그인이 안될 경우
%>
		<a href="registerUserForm.jsp">사원등록</a>
		<a href="loginForm.jsp">로그인</a>
<%
		}else{//로그인이 된 경우
%>
		<a href="myPage.jsp">MyPage</a>
		[<b><%= user_id %></b>님 로그인 중]
		<a href="logout.jsp">로그아웃</a>
<%
		}
%>
		</div>
	</div>
</body>
</html>