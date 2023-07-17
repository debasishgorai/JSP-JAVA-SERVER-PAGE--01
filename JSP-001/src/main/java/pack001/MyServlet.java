package pack001;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/dev")
public class MyServlet  extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7013765364469705299L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("name");
	String gender=req.getParameter("gen");
	
	HttpSession hs=req.getSession();
	hs.setAttribute("n",name);
	hs.setAttribute("g",gender);
	
	RequestDispatcher rd=req.getRequestDispatcher("display.jsp");
	rd.forward(req, resp);
	

}}


