package com.db.employeemanagement.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.employeemanagement.bean.LoginBean;
import com.db.system.service.LoginService;
import com.db.system.service.LoginServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public LoginServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("uname");
		String password = request.getParameter("psw");
		LoginBean login=new  LoginBean(username, password);
		LoginService loginService=new LoginServiceImpl();
		System.out.println(username);
		System.out.println(password);
//		differnece in workflow->change in address(1st method) why>?? when we have to inform about the change in domain
//		request dispatches(when? when there is internal shifting within the application),send redirect of response
		RequestDispatcher dispatcher=null;
		
//		controller layer will now talk to service ,so the below is commented
//		if ("admin".equals(username) && "admin".equals(password)) {
////			response.sendRedirect("AdminHome.html");     1st method
//			dispatcher=request.getRequestDispatcher("AdminHome.html");
//			dispatcher.forward(request, response);
//			
//		} else {
//			response.sendRedirect("form.html");
//		}
		
		if (loginService.authenticate(login)) {
		dispatcher=request.getRequestDispatcher("AdminHome.html");
		dispatcher.forward(request, response);
		
	} else {
		response.sendRedirect("form.html");
	}

	}

}
