package br.com.coren_ba.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Oi")
public class OiMundo extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service (HttpServletRequest request, HttpServletResponse response) {
		PrintWriter out;
		try {
			out = response.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Primeira Servlet</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Olá Coren-BA!</h1>");
			out.println("</body>");
			out.println("</html>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
