package tw.brad.bradweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Brad32")
public class Brad32 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PrintWriter out;
	private MyCart myCart;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		out = response.getWriter();

		out.println("Brad32<hr>");

		int Lottery = (int)(Math.random()*49+1);
		out.print("Lottery:" + Lottery + "<br>");
		
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(10);
		session.setAttribute("name", "brad");
		session.setAttribute("lottery", Lottery); // Lottery(int)=>autoboxing=>Integer
		myCart = new MyCart("brad");
		session.setAttribute("cart", myCart);
		
		
		
		out.print("<a href='Brad33'>Goto Brad33</a>");
	
	}

}
