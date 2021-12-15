

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Servlet implementation class CalcServ
 */
@WebServlet("/CalcServ")
public class CalcServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out = response.getWriter();
		int x,y;
		String str="";
		x=Integer.parseInt(request.getParameter("num1"));
		y=Integer.parseInt(request.getParameter("num2"));
		str=request.getParameter("operation");
		if(str.equals("add"))
			out.println("<h1>Result of Addition is: "+ (x+y)+ "</h1>");
		else if(str.equals("sub"))
			out.println("<h1>Result of Subtraction is: "+ (x-y)+ "</h1>");
		else if(str.equals("mul"))
			out.println("<h1>Result of Multiplication is: "+ (x*y)+ "</h1>");
		else if(str.equals("div"))
			out.println("<h1>Result of Division is: "+ (x/y)+ "</h1>");
		else
			out.println("<h1>Result of modulus is: "+ (x%y)+ "</h1>");
	}

	
}
