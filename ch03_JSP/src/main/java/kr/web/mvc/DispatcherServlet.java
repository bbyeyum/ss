package kr.web.mvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException,IOException{
		requestPro(request,response);
	}
	@Override
	public void doPost(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException,IOException{
		requestPro(request,response);
	}
	private void requestPro(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException,IOException{
		Action com = null;
		String view = null;
		
//		String command = request.getParameter("command");
//		if(command == null || command.equals("list")) {
//			com = new ListAction();
//		}else if(command.equals("write")) {
//			com = new WriteAction();
//		}else if(command.equals("detail")) {
//			com = new DetailAction();
//		}
		
		String command = request.getRequestURI();
		System.out.println("1" + command);
		if(command.indexOf(request.getContextPath())==0) {
			command = command.substring(request.getContextPath().length());
			System.out.println("2" + command);
		}
		
		if(command.equals("/list.do")) {
			com = new ListAction();
		}else if(command.equals("/write.do")) {
			com = new WriteAction();
		}else if(command.equals("/detail.do")) {
			com = new DetailAction();
		}else if(command.equals("/update.do")) {
			com = new UpdateAction();
		}else if(command.equals("/delete.do")) {
			com = new DeleteAction();
		}
		
		
		try {
			view = com.execute(request, response);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//forward 방식으로 view(jsp) 호출
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
	}
}





