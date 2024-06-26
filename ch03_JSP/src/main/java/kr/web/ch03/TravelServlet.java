package kr.web.ch03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/travel")
public class TravelServlet extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		//문서 타입 및 캐릭터셋 지정
		response.setContentType("text/html;charset=utf-8");

		//post 방식으로 데이터를 전송할 경우 인코딩 타입 지정
		request.setCharacterEncoding("utf-8");

		//HTML 출력을 위한 출력 스트림 생성 
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>여행지 선택</title></head>");
		out.println("<body>");
		
		String[] values = request.getParameterValues("city");
		if(values != null) {//여행지를 선택한 경우
			for(int i=0; i <= values.length; i++) {
				out.print(values[i]);
				if(i < values.length - 1) out.print(",");
			}
		}else {//여행지를 선택하지 않은 경우
			out.println("선택한 여행지가 없습니다.");
		}
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}
