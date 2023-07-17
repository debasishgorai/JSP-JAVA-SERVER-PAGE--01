import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/devv")
public class Details extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("name");
	String age=req.getParameter("age");
	//HttpSession hs=req.getSession();
	//hs.setAttribute("n",name);
	//hs.setAttribute("g",gender);
	
	RequestDispatcher rd=req.getRequestDispatcher("second.jsp");
	rd.forward(req, resp);
}
}