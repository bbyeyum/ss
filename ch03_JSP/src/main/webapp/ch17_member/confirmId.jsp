<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kr.member.dao.MemberDAO" %>
<%@ page import="kr.member.vo.MemberVO" %>
<%

	request.setCharacterEncoding("utf-8");
	//전송된 데이터 반환	
	String id = request.getParameter("id");
	
	MemberDAO dao = MemberDAO.getInstance();
	MemberVO member = dao.checkMember(id);
	if(member != null){//아이디 중복
%>
	{"result":"idDuplicated"}
<%
	}else{//아이디 미중복
%>
	{"result":"idNotFound"}
<%
	}
%>