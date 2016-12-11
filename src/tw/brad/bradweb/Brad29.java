package tw.brad.bradweb;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad29")
public class Brad29 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PrintWriter out;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		out = response.getWriter();
		
		String account = request.getParameter("account");
		String passwd = request.getParameter("passwd");
		if (account != null){
			String auto = request.getParameter("auto");
			// check account / passowrd
			if (account.equals("iii") && passwd.equals("123")){
				// Login OK
				if (auto != null && auto.equals("true")){
					// addCookie
				}
				// forward
			}
		}
		
		
		outHTML();
	}

	private void outHTML(){
		out.println("<form>");
		out.println("Account: <input type='text' name='account' /><br />");
		out.println("Password: <input type='password' name='passwd' /><br />");
		out.println("<input type='checkbox' name='auto' value='true' />Auto<br />");
		out.println("<input type='submit' value='Login'>");
		out.println("</form>");
	}


}
