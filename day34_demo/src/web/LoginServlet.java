package web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.User;
import service.UserService;

/**
 *  
 * 
 */
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		try{
			//0:处理响应中文乱码问题
			response.setContentType("text/html;charset=utf-8");
			
			//1：获取用户名和密码
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			//调用service查询用户，返回user
			 UserService us = new  UserService();
			 User user = us.login(username, password);
			 if(user != null){
				 //用户存在
				 response.getWriter().write("欢迎您：" + username);
			 }else{
				 response.getWriter().write("用户名或密码错误");
			 }
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
