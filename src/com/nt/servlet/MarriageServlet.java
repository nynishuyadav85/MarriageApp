package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MarriageServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			PrintWriter pw = null;
			String name = null;
			String gender = null;
			
			int age = 0;
	 		res.setContentType("text/html");
			pw = res.getWriter();
			
			name = req.getParameter("pname");
			age = Integer.parseInt(req.getParameter("page"));
			gender = req.getParameter("gender");
			
			if(gender.equalsIgnoreCase("M")) {
			
			
				if(age>=21) {
				
					pw.println("<h1 style='color:green;text-align:center'>" +name+ "you are elegible for marriage </h1>" );
				}
					else {
						pw.println("<h1 style='color:red;text-align:center'>"+name+ "you are not eligible for marriage</h1>");
					}
			}	
					
			else if(gender.equalsIgnoreCase("F")){
				
				if(age>=18) {
					pw.println("<h1 style='color:green;text-align:center'>" +name+ "you are eligible for marriage</h1>");
				}
				else {
					pw.println("<h1 style='color:red;text-align:center'>"+name+ "you are not eligible for marriage</h1>");
				}
				
		}
			pw.println("<a href='http://localhost:2030/MarriageApp/input.html'><img src ='home.png'></a>");
			pw.close();
	    }
			
			
	}


