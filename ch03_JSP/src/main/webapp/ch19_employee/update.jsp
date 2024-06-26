<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kr.story.dao.StoryDAO" %>
<%@ page import="kr.story.vo.StoryVO" %>

<% 
	//전송된 데이터 인코딩 타입 지정
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="storyVO" class="kr.story.vo.StoryVO"/>
<jsp:setProperty property="*" name="storyVO"/>
<% 
	StoryDAO dao = StoryDAO.getInstance();
	//비밀번호 인증을 위해서 기본키를 전달하고 한 건의 레코드를 전달받음
	StoryVO db_story = dao.getStory(storyVO.getNum());
	boolean check = false;
	if(db_story != null){
		//여기 알아서 수정하시오!!
	}
	if(check){ //인증성공
		storyVO.setIp(request.getRemoteAddr());
		dao.update(storyVO);
%>
	<script type="text/javascript">
		alert('글 수정을 완료했습니다.');
		location.href = 'detail.jsp?snum=<%=storyVO.getSnum() %>';
	</script>
<%
	}else{//인증실패
%>
	<script type="text/javascript">
		alert('비밀번호 불일치');
		history.go(-1);
	</script>
<%		
	}
%>