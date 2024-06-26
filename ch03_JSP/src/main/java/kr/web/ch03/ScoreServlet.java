package kr.web.ch03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/score")
public class ScoreServlet extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		
		//성적 처리
		//국어, 영어, 수학, 총점, 평균, 등급 출력
		
		
		//문서 타입 및 캐릭터셋 지정
		response.setContentType("text/html;charset=utf-8");

		//post 방식으로 데이터를 전송할 경우 인코딩 타입 지정
		request.setCharacterEncoding("utf-8");

		int korean = Integer.parseInt(request.getParameter("korean"));
		int english = Integer.parseInt(request.getParameter("english"));
		int math = Integer.parseInt(request.getParameter("math"));
		int sum = korean + english + math;
		int avg = sum / 3;
		String grade;
		
		switch(avg / 10) {
		case 10: 
		case 9: grade = "A"; break;
		case 8: grade = "B"; break;
		case 7: grade = "C"; break;
		case 6: grade = "D"; break;
		default: grade = "F";
		}
		
		//HTML 출력을 위한 출력 스트림 생성 
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>성적 처리</title></head>");
		out.println("<body>");
		out.println("국어: " + korean + "<br>");
		out.println("영어: " + english + "<br>");
		out.println("수학: " + math + "<br>");
		out.println("총점: " + sum + "<br>");
		out.println("평균: " + avg + "<br>");
		out.println("등급: " + grade);
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}
