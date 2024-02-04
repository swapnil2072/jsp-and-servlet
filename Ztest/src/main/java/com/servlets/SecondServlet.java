package com.servlets;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.*;
import java.io.IOException;

import jakarta.servlet.GenericServlet;

public class SecondServlet extends GenericServlet {
	
	public void service (ServletRequest req,ServletResponse res) throws ServletException,IOException{
		System.out.println("This is servlet using generic servlet");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>this is my second servlet using generic servlet.</h1>");
		out.println("<h1>Todays data and time "+ new Date().toString() +"</h1>");
		
	}
	
}
