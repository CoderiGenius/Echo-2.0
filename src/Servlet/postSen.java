package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import text.Cross;


/**
 * Servlet implementation class getpost
 */
public class postSen extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public postSen() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request==null)request.setAttribute("ValueB","哎呦，你是不是溜进来的？");
		Cross sen = new Cross();
		String sentence = request.getParameter("sen");
		System.out.println(":"+sentence);
		if(sentence!=""){
		List<String> fatchedSen = Cross.main(sentence);
		response.setContentType("text/html;charset=utf-8");
		//response.getWriter().write(fatchedSen.get(0));
		
	    request.setAttribute( "ValueA",fatchedSen); 
	    request.setAttribute("ValueB",sentence);
        request.getRequestDispatcher( "../processed.jsp").forward(request,response); 
		}
		else response.sendRedirect("../index.jsp");
		
	}

}
