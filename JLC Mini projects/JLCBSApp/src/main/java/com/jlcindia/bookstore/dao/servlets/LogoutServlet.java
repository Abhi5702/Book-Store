package com.jlcindia.bookstore.servlets; 
 
import java.io.IOException; 
 
import javax.servlet.RequestDispatcher; 
import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
import javax.servlet.http.HttpSession; 
 

 
@WebServlet(name = "mylogout", urlPatterns = "/mylogout.jlc") 
public class LogoutServlet extends JLCBaseServlet { 
public void service(HttpServletRequest req, HttpServletResponse res) throws 
ServletException, IOException { 
System.out.println("LogoutServlet-service()"); 
String page = "login.jsp"; 
HttpSession session = req.getSession(false); 
if (session != null) 
session.invalidate(); 
 
String logoutMsg = "You have logged out Successfully"; 
req.setAttribute("LogoutMsg", logoutMsg); 
RequestDispatcher rd = req.getRequestDispatcher(page); 
rd.forward(req, res); 
} 
} 
  
