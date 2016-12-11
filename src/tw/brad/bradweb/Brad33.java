package tw.brad.bradweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Brad33")
public class Brad33 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PrintWriter out;
	private MyCart myCart;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		out = response.getWriter();

		HttpSession session = request.getSession();
		String name = (String)session.getAttribute("name");
		Integer Lottery = (Integer)session.getAttribute("lottery");
		myCart = (MyCart)session.getAttribute("cart");
		if (name == null){
			response.sendRedirect("Brad32");
			return;
		}
		
		out.println("Brad33<hr>");
		out.print(name + ":" + Lottery + "<br>");
		out.println("<a href='Brad35'>Logout</a>");
		
		
		myCart.addItem("apple", 10);
		myCart.addItem("pen", 20);
		
		
		
	
	}

}
