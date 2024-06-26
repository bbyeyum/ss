package kr.web.ch03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/greeting")
public class GreetingServlet extends HttpServlet{
	@Override
			 //★doGet아님!!
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		//문서 타입 및 캐릭터셋 지정
		response.setContentType("text/html;charset=utf-8");
		
		//★post 방식으로 데이터를 전송할 경우 인코딩 타입 지정 (get 방식 때는 할 필요 없지만 post 방식에서는 무조건 거쳐야 함)
		request.setCharacterEncoding("utf-8");
		
		//전송된 데이터 반환
		String name = request.getParameter("name"); //인코딩 타입 지정 후에 전송된 데이터 반환해야 데이터가 깨지지 않고 반환됨
		
		//HTML 출력을 위한 출력 스트림 생성
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>Greeting</title></head>");
		out.println("<body>");
		out.println(name + "님의 방문을 환영합니다.");
		out.println("</body>");
		out.println("</html>");
		out.close();	
	}
}
