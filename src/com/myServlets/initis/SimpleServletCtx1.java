package com.myServlets.initis;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServletCtx1
 */
@WebServlet(name="SimpleServletCtx1",urlPatterns={"/SimpleServletCtx1"},
initParams={@WebInitParam(name="name",value="Duke"),@WebInitParam(name="movie",value="star wars")})
public class SimpleServletCtx1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleServletCtx1(){
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#getServletConfig()
	 */


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<Title>");
		out.println("Use of getServletConfig");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
//		ServletContext context=request.getServletContext();
//		out.println("<p>This value is from ServletConext object  created by HttpRequest object = "+context.getInitParameter("movie")+"</p>");
		out.println("<p> This is simple app to demonstrate getServletConfig() name = "+getServletConfig().getInitParameter("name")+"</p>");
		out.println("<br />");
		out.println("<p> This is simple app to demonstrate getServletConfig() name = "+getServletConfig().getInitParameter("movie")+"</p>");
		//out.println("<p> This is simple app to demonstrate getServletConfig()</p>");
		out.println("</body>");
		out.println("</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
