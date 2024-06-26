<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kr.story.dao.StoryDAO" %>
<%@ page import="kr.story.vo.StoryVO" %>
<% 
	int snum = Integer.parseInt(request.getParameter("snum"));
	StoryDAO dao = StoryDAO.getInstance();
	StoryVO storyVO = dao.getStory(snum);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원이야기 상세보기</title>
<link rel="stylesheet" href="<%= request.getContextPath() %>/css/style.css" type="text/css">
</head>
<body>
	<div class="page-main">
		<h1>사원이야기 상세보기</h1>
		<ul>
			<li>글번호: <%= storyVO.getSnum() %></li>
			<li>제목: <%= storyVO.getTitle() %></li>
			<li>작성자: <%= storyVO.getId() %></li>
		</ul>
		<hr size="1" width="100%" noshade="noshade">
		<p>
			<%= storyVO.getContent() %>
		</p>
		<div class="align-right">
			작성일: <%= storyVO.getReg_date() %>
			<input type="button" value="수정" onclick="location.href='updateForm.jsp?snum=<%= storyVO.getSnum()%>'">
			<input type="button" value="삭제" onclick="location.href='deleteForm.jsp?snum=<%= storyVO.getSnum()%>'">
			<input type="button" value="목록" onclick="location.href='list.jsp'">
		</div>
	</div>
</body>
</html>