package com.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;


public class ThirdServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("This is get method....");
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.print("<h1>this is get method of my servlet </h1>");
	}
}
