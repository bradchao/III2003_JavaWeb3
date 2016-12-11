package tw.brad.bradweb;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad31")
public class Brad31 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		if (cookies != null){
			for (Cookie cookie : cookies){
				cookie.setValue(null);
				cookie.setMaxAge(0);// 0 : delete; -1: not stored
				response.addCookie(cookie);
			}
		}
	}

}
